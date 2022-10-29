import { Component, OnInit } from '@angular/core';
import {HttpClient, HttpHeaders} from '@angular/common/http';
import {catchError} from 'rxjs/operators' 
import { Observable } from 'rxjs';
import { ToastrService } from 'ngx-toastr';

@Component({
  selector: 'app-consultacliente',
  templateUrl: './consultacliente.component.html',
  styleUrls: ['./consultacliente.component.css']
})
export class ConsultaclienteComponent implements OnInit {


  cliente:any=[];  
  clientesb:any=[];
  paginaActual:number=1;
 
  constructor(private http:HttpClient,private toastr: ToastrService) { }

  ngOnInit(): void {
    this.buscarUsuarios();

  }
  buscarUsuarios(){


    this.buscarUsuariosServicio().subscribe(
      (response:any)=> this.cliente=response

      
    )
  }

  buscarUsuariosServicio():Observable<any>{
    return this.http.get<any>('http://localhost:6500/cliente/buscar').pipe(
      catchError(e=> "error")
    )
  }
  
editar(clientes:any){
  console.log(clientes.idprofesor);

  localStorage.setItem("editar",JSON.stringify(clientes))
  location.href="/editarCliente";
}

  eliminar(clientes:any){

   this.eliminarUsuarioServicio(clientes.idCliente).subscribe(
      (response:any)=> this.confirmarEliminacion()
    )
  }
  
  confirmarEliminacion(){
    this.toastr.success('El Cliente fue eliminado Correctamente', 'Cliente Eliminado',
    {positionClass:'toast-bottom-right'});
    this.buscarUsuarios()
  }
    eliminarUsuarioServicio(id:any){
      return this.http.delete<any>('http://localhost:6500/cliente/eliminar/'+id).pipe(
        catchError(e=> "error")
      )
    }
    agregarBoton(){
      location.href="/cliente";
      localStorage.removeItem("editar")
     
    }
  




 buscar(){
   if(this.cliente.idCliente==null||this.cliente.idPersona==null){

  
    this.toastr.success('Debe de llenar ambos campos ', 'Cliente Eliminado');
   }else{
    this.buscarUsu(this.cliente).subscribe(
  
      (response:any)=> this.cliente=response)
   
   }


     
     
    
  
     
     
    }


    
  
    buscarUsu(usu:any):Observable<any>{
      return this.http.get<any>('http://localhost:3031/profesor/prof/'+usu.nombreProfesor+"/"+usu.apellidoProfesor).pipe(
        catchError(e=> "error")
      )
    }
  


}
