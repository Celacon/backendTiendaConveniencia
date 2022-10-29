import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup,Validators } from '@angular/forms';

import {HttpClient} from '@angular/common/http';
import {catchError} from 'rxjs/operators' 
import { HttpHeaders } from '@angular/common/http';
import { ToastrService } from 'ngx-toastr';
import { ActivatedRoute } from '@angular/router';
import { Observable } from 'rxjs';

@Component({
  selector: 'app-creacion-producto',
  templateUrl: './creacion-producto.component.html',
  styleUrls: ['./creacion-producto.component.css']
})
export class CreacionProductoComponent implements OnInit {

  usuarios:any={};
  Llenar:boolean=false;
  Llenar2:boolean=true;
loading=false;

titulo='AGREGAR PROFESOR';
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
      this.titulo='EDITAR PROFESOR';
      this.tituloBotonAgregar='GUARDAR';
      this.usuarios=JSON.parse(temporal|| '{}');
    }
   
  }

  agregarProfesor(){


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
  return this.http.post<any>('http://localhost:6500/persona/guardar',this.usuarios,httpOptions).pipe(
    catchError(e=> "error")
  )

}
confirmarCreacion(res:any){
  this.usuarios={};
  
  this.loading=true;
  location.href="/consultaProfesor";
  this.toastr.success("El usuario fue creado correctamente con Usuario  --"+res.primerNombre+"-- y Password:  "+res.primerApellido+"--", 'Profesor Creado',
  {positionClass:'toast-bottom-right'});
  
}

volver(){
   location.href="/consultaProfesor";
   
   localStorage.removeItem("editar")
   
}
volverBienvenidaAdmin(){
 
  
  localStorage.removeItem("editar")
  location.href="/bienvenidaAdmin"

}

}