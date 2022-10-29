import { Component, OnInit } from '@angular/core';
import {HttpClient, HttpHeaders} from '@angular/common/http';
import {catchError} from 'rxjs/operators' 
import { Observable } from 'rxjs';
import { ToastrService } from 'ngx-toastr';

@Component({
  selector: 'app-consulta-empleado',
  templateUrl: './consulta-empleado.component.html',
  styleUrls: ['./consulta-empleado.component.css']
})
export class ConsultaEmpleadoComponent implements OnInit {
  empleado:any=[];
  empleadoBuscar:any=[]; 

  persona:any={}; 
  usuariosB:any=[];
  paginaActual:number=1;

  constructor(private http:HttpClient,private toastr: ToastrService) { }

  ngOnInit(): void {
    this.buscarEmpleados();
  }

  buscarEmpleados(){


    this.buscarEmpleadoServicio().subscribe(
      (response:any)=> this.empleado=response

      
    )
  }

  buscarEmpleadoServicio():Observable<any>{
    return this.http.get<any>('http://localhost:6500/vEmpleadosNoAsignados/buscar').pipe(
      catchError(e=> "error")
    )
  }

 
  
    eliminar(datos:any){
  
     this.eliminarUsuarioServicio(datos.idEmpleado).subscribe(
        (response:any)=> this.confirmarEliminacion()
      )
    }
    
    confirmarEliminacion(){
      this.toastr.success('El empleado fue eliminado Correctamente', 'empleado Eliminado',
      {positionClass:'toast-bottom-right'});
      this.buscarEmpleados()
    }
      eliminarUsuarioServicio(id:any){
        return this.http.delete<any>('http://localhost:6500/empleado/eliminar/'+id).pipe(
          catchError(e=> "error")
        )
      }
      agregarBoton(){
        location.href="/creacionEmpleado";
        localStorage.removeItem("editar")
       
      }


      editar(datos:any){

this.buscarEmpleadoID(datos.idEmpleado);
       
      }

      editar2(datos:any){

     
          localStorage.setItem("editar",JSON.stringify(datos[0]))
          location.href="/editarEmpleado";
        }


        asignarUsuarioTurno(datos:any){

          this.buscarEmpleadoID2(datos.idEmpleado);

        }

        
        asignarUsuarioTurno2(datos:any){




          localStorage.setItem("editar",JSON.stringify(datos[0]))
          location.href="/asignacionUsuarioTurno";

        }






 
 buscarEmpleadoID(id:any){

  
  
    this.buscarEmpleadoIDServicio(id).subscribe(
  
      (response:any)=> this.editar2(response))
   
   }




   buscarEmpleadoID2(id:any){

  
  
    this.buscarEmpleadoIDServicio(id).subscribe(
  
      (response:any)=> this.asignarUsuarioTurno2(response))
   
   }
 
  
 
 buscarEmpleadoIDServicio(id:any):Observable<any>{
   return this.http.get<any>('http://localhost:6500/empleado/buscar/por/'+id).pipe(
     catchError(e=> "error")
   )
 }


 
      
    



}
