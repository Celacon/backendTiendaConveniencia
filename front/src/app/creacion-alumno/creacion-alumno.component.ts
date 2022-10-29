import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup,Validators } from '@angular/forms';

import {HttpClient} from '@angular/common/http';
import {catchError} from 'rxjs/operators' 
import { HttpHeaders } from '@angular/common/http';
import { ToastrService } from 'ngx-toastr';
import { ActivatedRoute } from '@angular/router';
import { Observable } from 'rxjs'

@Component({
  selector: 'app-creacion-alumno',
  templateUrl: './creacion-alumno.component.html',
  styleUrls: ['./creacion-alumno.component.css']
})
export class CreacionAlumnoComponent implements OnInit {
  alumnos:any={};
  Llenar:boolean=false;
  Llenar2:boolean=true;
loading=false;

titulo='AGREGAR ALUMNO';
tituloBotonAgregar='AGREGAR';
  constructor(private fb: FormBuilder,
    private http:HttpClient,
    private toastr: ToastrService,
    private aRoute:ActivatedRoute) { }

  ngOnInit(): void {
    let temporal =localStorage.getItem("editar");

    if (temporal!=null){
      this.Llenar2=false;
      this.Llenar=true;
      this.titulo='EDITAR ALUMNO';
      this.tituloBotonAgregar='GUARDAR';
      this.alumnos=JSON.parse(temporal|| '{}');
    }
  }

  agregarAlumno(){


    let formularioValido:any = document. getElementById("creacionForm");
    if(formularioValido.reportValidity()){
      this.servicioCrear().subscribe(
        (respuesta: any)=> this.confirmarCreacion(respuesta)

      )
  }
}

servicioCrear(){

var httpOptions ={
  headers: new HttpHeaders({
    'Content-Type':'application/json'
  })
} 
return this.http.post<any>('http://localhost:3031/alumno/guardar',this.alumnos,httpOptions).pipe(
  catchError(e=> "error")
)

}
confirmarCreacion(res:any){
this.alumnos={};

this.loading=true;
location.href="/consultaAlumno";
this.toastr.success("El Alumno fue creado correctamente con Carnet  --"+res.idcarnet+"-- y Password:  "+res.passwordAlumno+"--", 'Alumno Creado',
{positionClass:'toast-bottom-right'});

}

volver(){
 location.href="/consultaAlumno";
 
 localStorage.removeItem("editar")
 
}
volverBienvenidaAdmin(){


localStorage.removeItem("editar")
location.href="/bienvenidaAdmin"

}

}
