import { Component, OnInit } from '@angular/core';
import {HttpClient, HttpHeaders} from '@angular/common/http';
import {catchError} from 'rxjs/operators' 
import { Observable } from 'rxjs';
import { ToastrService } from 'ngx-toastr';

@Component({
  selector: 'app-consulta-profesor',
  templateUrl: './consulta-profesor.component.html',
  styleUrls: ['./consulta-profesor.component.css']
})



export class ConsultaProfesorComponent implements OnInit {
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
  location.href="/editarProfesor";
}

  eliminar(datos:any){

   this.eliminarUsuarioServicio(datos.idprofesor).subscribe(
      (response:any)=> this.confirmarEliminacion()
    )
  }
  
  confirmarEliminacion(){
    this.toastr.success('El Usuario fue eliminado Correctamente', 'Profesor Eliminado',
    {positionClass:'toast-bottom-right'});
    this.buscarUsuarios()
  }
    eliminarUsuarioServicio(id:any){
      return this.http.delete<any>('http://localhost:6500/persona/eliminar/'+id).pipe(
        catchError(e=> "error")
      )
    }
    agregarBoton(){
      location.href="/creacionProfesor";
      localStorage.removeItem("editar")
     
    }
  




 buscar(){
   if(this.usuariosB.nombreProfesor==null||this.usuariosB.apellidoProfesor==null){

    this.toastr.success('Debe de llenar ambos campos ', 'Profesor Eliminado');
   }else{
    this.buscarUsu(this.usuariosB).subscribe(
  
      (response:any)=> this.usuarios=response)
   
   }


     
     
    
  
     
     
    }


    
  
    buscarUsu(usu:any):Observable<any>{
      return this.http.get<any>('http://localhost:3031/profesor/prof/'+usu.nombreProfesor+"/"+usu.apellidoProfesor).pipe(
        catchError(e=> "error")
      )
    }
  
  


  


}
