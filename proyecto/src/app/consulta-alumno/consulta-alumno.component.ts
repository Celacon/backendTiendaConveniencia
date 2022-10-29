import { Component, OnInit } from '@angular/core';
import {HttpClient, HttpHeaders} from '@angular/common/http';
import {catchError} from 'rxjs/operators' 
import { Observable } from 'rxjs';
import { ToastrService } from 'ngx-toastr';

@Component({
  selector: 'app-consulta-alumno',
  templateUrl: './consulta-alumno.component.html',
  styleUrls: ['./consulta-alumno.component.css']
})



export class ConsultaAlumnoComponent implements OnInit {
  alumnos:any=[];
  paginaActual:number=1;
 

  constructor(private http:HttpClient,private toastr: ToastrService) { }

  ngOnInit(): void {
    this.buscarAlumnos();
  }
  buscarAlumnos(){

    this.buscarAlumnosServicio().subscribe(
      (response:any)=> this.alumnos=response

      
    )
   
  }

  buscarAlumnosServicio():Observable<any>{
    return this.http.get<any>('http://localhost:3031/alumno/buscar').pipe(
      catchError(e=> "error")
    )
  }








editar(datos:any){


  localStorage.setItem("editar",JSON.stringify(datos))
  location.href="/editarAlumno";
}

  eliminar(datos:any){

   this.eliminarAlumnoServicio(datos.idcarnet).subscribe(
      (response:any)=> this.confirmarEliminacion()
    )
  }
  
  confirmarEliminacion(){
    this.toastr.success('El Alumno fue eliminado Correctamente', 'Alumno Eliminado',
    {positionClass:'toast-bottom-right'});
    this.buscarAlumnos()
  }
    eliminarAlumnoServicio(id:any){
      return this.http.delete<any>('http://localhost:3031/alumno/eliminar/'+id).pipe(
        catchError(e=> "error")
      )
    }
    agregarBoton(){
      location.href="/creacionAlumno";
      localStorage.removeItem("editar")
     
    }
}
