import { Component, OnInit } from '@angular/core';
import {HttpClient, HttpHeaders} from '@angular/common/http';
import {catchError} from 'rxjs/operators' 
import { Observable } from 'rxjs';
import { ToastrService } from 'ngx-toastr';

@Component({
  selector: 'app-consulta-persona',
  templateUrl: './consulta-persona.component.html',
  styleUrls: ['./consulta-persona.component.css']
})

export class ConsultaPersonaComponent implements OnInit {

  usuarios:any=[];  
  usuariosB:any=[];
  paginaActual:number=1;
 
 
 
  constructor(private http:HttpClient,private toastr: ToastrService) { }

  ngOnInit(): void {
    this.buscarUsuarios();
  }

  buscarUsuarios(){


    this.buscarUsuariosServicio().subscribe(
      (response:any)=> this.usuarios=response

      
    )
  }

  buscarUsuariosServicio():Observable<any>{
    return this.http.get<any>('http://localhost:6500/persona/buscar').pipe(
      catchError(e=> "error")
    )
  }



  editar(datos:any){
    console.log(datos.idprofesor);
  
    localStorage.setItem("editar",JSON.stringify(datos))
    location.href="/editarPersona";
  }
  
    eliminar(datos:any){
  
     this.eliminarUsuarioServicio(datos.idPersona).subscribe(
        (response:any)=> this.confirmarEliminacion()
      )
    }
    
    confirmarEliminacion(){
      this.toastr.success('La persona fue eliminada Correctamente', 'Profesor Eliminado',
      {positionClass:'toast-bottom-right'});
      this.buscarUsuarios()
    }
      eliminarUsuarioServicio(id:any){
        return this.http.delete<any>('http://localhost:6500/persona/eliminar/'+id).pipe(
          catchError(e=> "error")
        )
      }
      agregarBoton(){
        location.href="/creacionPersona";
        localStorage.removeItem("editar")
       
      }
    

}
