import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup,Validators } from '@angular/forms';

import {HttpClient} from '@angular/common/http';
import {catchError} from 'rxjs/operators' 
import { HttpHeaders } from '@angular/common/http';
import { ToastrService } from 'ngx-toastr';

import { Observable } from 'rxjs';

@Component({
  selector: 'app-creacion-asignacion',
  templateUrl: './creacion-asignacion.component.html',
  styleUrls: ['./creacion-asignacion.component.css']
})
export class CreacionAsignacionComponent implements OnInit {
  asignaciones:any={};

  alumnos:any=[];
  cursos:any=[];

  

 
  Llenar2:boolean=false;
loading=false;

titulo='AGREGAR CURSO';
tituloBotonAgregar='AGREGAR';

  constructor(private fb: FormBuilder,
    private http:HttpClient,
    private toastr: ToastrService
   ) { }

  ngOnInit(): void {
      
    this.buscarAlumno();
    this.buscarCurso();
    
    let temporal =localStorage.getItem("editar");

    if (temporal!=null){
      this.Llenar2=true;
      
      this.titulo='EDITAR CURSO';
      this.tituloBotonAgregar='GUARDAR';
      this.asignaciones=JSON.parse(temporal|| '{}');
    }
  }

  agregarAsignacion(){


    let formularioValido:any = document. getElementById("creacionForm");
console.log(formularioValido)
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
 location.href="/consultaAsignacion";
 
 localStorage.removeItem("editar")
 
}
volverBienvenidaAdmin(){


localStorage.removeItem("editar")
location.href="/bienvenidaAdmin"

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
