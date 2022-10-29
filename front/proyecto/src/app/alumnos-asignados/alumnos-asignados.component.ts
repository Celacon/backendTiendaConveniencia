import { Component, OnInit } from '@angular/core';
import {HttpClient, HttpHeaders} from '@angular/common/http';
import {catchError} from 'rxjs/operators' 
import { Observable } from 'rxjs';
import { ToastrService } from 'ngx-toastr';

@Component({
  selector: 'app-alumnos-asignados',
  templateUrl: './alumnos-asignados.component.html',
  styleUrls: ['./alumnos-asignados.component.css']
})
export class AlumnosAsignadosComponent implements OnInit {
  asignacion:any={};
  alumnos:any={};

  paginaActual:number=1;
  constructor(private http:HttpClient) { }

  ngOnInit(): void {
    this.asignacion=JSON.parse(localStorage.getItem("alumnosCurso")|| '{}');
    this.buscarAlumno();
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

  asignarNota(nota:any){

    localStorage.setItem("nota",JSON.stringify(nota))
  location.href="/asignarNota";
  }

  volverBienvenidaProfesor(){
    location.href="/bienvenidaProfesor"
    localStorage.removeItem("alumnosCurso")
  }
  volverCursosAsignados(){
    location.href="/cursosAsignados"
    localStorage.removeItem("alumnosCurso")
  }
}
