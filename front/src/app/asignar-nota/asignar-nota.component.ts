import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup,Validators } from '@angular/forms';

import {HttpClient} from '@angular/common/http';
import {catchError} from 'rxjs/operators' 
import { HttpHeaders } from '@angular/common/http';
import { ToastrService } from 'ngx-toastr';
import { ActivatedRoute } from '@angular/router';
import { Observable } from 'rxjs';

@Component({
  selector: 'app-asignar-nota',
  templateUrl: './asignar-nota.component.html',
  styleUrls: ['./asignar-nota.component.css']
})
export class AsignarNotaComponent implements OnInit {
  asignaciones:any={};
  alumnos:any={};
  cursos:any={};
 
  loading=false;
  


  constructor(private fb: FormBuilder,
    private http:HttpClient,
    private toastr: ToastrService,
    private aRoute:ActivatedRoute) { }

  ngOnInit(): void {
    this.buscarAlumno();
    this.buscarCurso();
    
    let temporal =localStorage.getItem("nota");

    if (temporal!=null){
      
      this.asignaciones=JSON.parse(temporal|| '{}');
    }
  }
  
  agregarAsignacion(){


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
return this.http.post<any>('http://localhost:3031/asignacion/guardar',this.asignaciones,httpOptions).pipe(
  catchError(e=> "error")
)

}
confirmarCreacion(res:any){
this.asignaciones={};

this.loading=true;
location.href="/consultaAsignacion";
this.toastr.success("La asignacion fue creada", 'Curso Creado',
{positionClass:'toast-bottom-right'});

}

volver(){
 location.href="/alumnosAsignados";
 
 localStorage.removeItem("nota")
 
}
volverBienvenidaProfesor(){


localStorage.removeItem("nota")
location.href="/bienvenidaProfesor"

}

buscarAlumno(){

  this.buscarAlumnoServicio().subscribe(
    (response:any)=> this.alumnos=response

    
  )
}

buscarAlumnoServicio():Observable<any>{
  return this.http.get<any>('http://localhost:3031/alumno/buscar').pipe(
    catchError(e=> "error")
  )
}

buscarCurso(){

  this.buscarCursoServicio().subscribe(
    (response:any)=> this.cursos=response

    
  )
}

buscarCursoServicio():Observable<any>{
  return this.http.get<any>('http://localhost:3031/curso/buscar').pipe(
    catchError(e=> "error")
  )
}

}
