import { Component, OnInit } from '@angular/core';
import {HttpClient, HttpHeaders} from '@angular/common/http';
import {catchError} from 'rxjs/operators' 
import { Observable } from 'rxjs';
import { ToastrService } from 'ngx-toastr';

@Component({
  selector: 'app-consulta-asignacion',
  templateUrl: './consulta-asignacion.component.html',
  styleUrls: ['./consulta-asignacion.component.css']
})
export class ConsultaAsignacionComponent implements OnInit {
  asignaciones:any={};
  cursos:any={};

  alumnos:any={};
  
  paginaActual:number=1;

  constructor(private http:HttpClient,private toastr: ToastrService) { }

  ngOnInit(): void {
    this.buscarCurso();
    this.buscarAlumno();
    this.buscarAsignaciones();
  }



  buscarAsignaciones(){

    this.buscarAsignacionesServicio().subscribe(
      (response:any)=> this.asignaciones=response

      
    )
  }

  buscarAsignacionesServicio():Observable<any>{
    return this.http.get<any>('http://localhost:3031/asignacion/buscar').pipe(
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








editar(datos:any){
  console.log(datos.idprofesor);

  localStorage.setItem("editar",JSON.stringify(datos))
  location.href="/editarAsignacion";
}

  eliminar(datos:any){

   this.eliminarUsuarioServicio(datos.idasignacion).subscribe(
      (response:any)=> this.confirmarEliminacion()
    )
  }
  
  confirmarEliminacion(){
    this.toastr.success('La asignación fue eliminada correctamente', 'Asignacion Eliminado',
    {positionClass:'toast-bottom-right'});
    this.buscarAsignaciones()
  }
    eliminarUsuarioServicio(id:any){
      return this.http.delete<any>('http://localhost:3031/asignacion/eliminar/'+id).pipe(
        catchError(e=> "error")
      )
    }
    agregarBoton(){
      location.href="/creacionAsignacion";
      localStorage.removeItem("editar")
     
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

}
