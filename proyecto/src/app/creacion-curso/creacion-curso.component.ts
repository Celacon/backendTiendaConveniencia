import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup,Validators } from '@angular/forms';

import {HttpClient} from '@angular/common/http';
import {catchError} from 'rxjs/operators' 
import { HttpHeaders } from '@angular/common/http';
import { ToastrService } from 'ngx-toastr';
import { ActivatedRoute } from '@angular/router';
import { Observable } from 'rxjs';

@Component({
  selector: 'app-creacion-curso',
  templateUrl: './creacion-curso.component.html',
  styleUrls: ['./creacion-curso.component.css']
})
export class CreacionCursoComponent implements OnInit {
profesores:any=[];
profesor:any=[];
  cursos:any={};
 

 

 
  Llenar2:boolean=false;
loading=false;

titulo='AGREGAR CURSO';
tituloBotonAgregar='AGREGAR';


  constructor(private fb: FormBuilder,
    private http:HttpClient,
    private toastr: ToastrService,
    private aRoute:ActivatedRoute) { }

  ngOnInit(): void {
   
    this.buscarUsuarios();
    let temporal =localStorage.getItem("editar");

    if (temporal!=null){
      this.Llenar2=true;
      
      this.titulo='EDITAR CURSO';
      this.tituloBotonAgregar='GUARDAR';
      this.cursos=JSON.parse(temporal|| '{}');
    }
  }

  agre(){
    this.buscarPro(this.cursos.profesorIdprofesor);
    console.log(this.profesor)
    if(this.profesor.cursoList.length<3){
     this. agregarCurso();


    }else{  this.toastr.success("YA no puedes asignar mas cursos, esta al máximo   --", 'Curso denegado');
  }
  }

  agregarCurso(){



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
return this.http.post<any>('http://localhost:3031/curso/guardar',this.cursos,httpOptions).pipe(
  catchError(e=> "error")
)

}
confirmarCreacion(res:any){
this.cursos={};

this.loading=true;
location.href="/consultaCurso";
this.toastr.success("El curso fue creado correctamente con Usuario  --"+res.idcurso+"--", 'Curso Creado',
{positionClass:'toast-bottom-right'});

}

volver(){
 location.href="/consultaCurso";
 
 localStorage.removeItem("editar")
 
}
volverBienvenidaAdmin(){


localStorage.removeItem("editar")
location.href="/bienvenidaAdmin"

}

buscarUsuarios(){

  this.buscarUsuariosServicio().subscribe(
    (response:any)=> this.profesores=response

    
  )
}

buscarUsuariosServicio():Observable<any>{
  return this.http.get<any>('http://localhost:3031/profesor/buscar').pipe(
    catchError(e=> "error")
  )
}



buscarPro(dato:any){

  this.buscarProfesorServicio(dato).subscribe(

    (response:any)=> this.profesor=response[0]
    

    
  )
 
 


 
 
}

buscarProfesorServicio(id:any):Observable<any>{
  return this.http.get<any>('http://localhost:3031/profesor/buscar/porId/'+id).pipe(
    catchError(e=> "error")
  )
}

}
