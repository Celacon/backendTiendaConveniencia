import { Component, OnInit } from '@angular/core';
import {HttpClient, HttpHeaders} from '@angular/common/http';
import {catchError} from 'rxjs/operators' 
import { Observable } from 'rxjs';
import { ToastrService } from 'ngx-toastr';

@Component({
  selector: 'app-consulta-curso',
  templateUrl: './consulta-curso.component.html',
  styleUrls: ['./consulta-curso.component.css']
})
export class ConsultaCursoComponent implements OnInit {
  cursos:any=[];
  profesores:any=[];
  
  paginaActual:number=1;

  constructor(private http:HttpClient,private toastr: ToastrService) { }

  ngOnInit(): void {
    this.buscarCurso();
    this.buscarUsuarios();
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
  location.href="/editarCurso";
}

  eliminar(datos:any){

   this.eliminarUsuarioServicio(datos.idcurso).subscribe(
      (response:any)=> this.confirmarEliminacion()
    )
  }
  
  confirmarEliminacion(){
    this.toastr.success('El Curso fue eliminado Correctamente', 'Curso Eliminado',
    {positionClass:'toast-bottom-right'});
    this.buscarCurso()
  }
    eliminarUsuarioServicio(id:any){
      return this.http.delete<any>('http://localhost:3031/curso/eliminar/'+id).pipe(
        catchError(e=> "error")
      )
    }
    agregarBoton(){
      location.href="/creacionCurso";
      localStorage.removeItem("editar")
     
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

}
