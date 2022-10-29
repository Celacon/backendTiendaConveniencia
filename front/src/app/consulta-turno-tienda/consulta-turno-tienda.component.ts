import { Component, OnInit } from '@angular/core';
import {HttpClient, HttpHeaders} from '@angular/common/http';
import {catchError} from 'rxjs/operators' 
import { Observable } from 'rxjs';
import { ToastrService } from 'ngx-toastr';

@Component({
  selector: 'app-consulta-turno-tienda',
  templateUrl: './consulta-turno-tienda.component.html',
  styleUrls: ['./consulta-turno-tienda.component.css']
})
export class ConsultaTurnoTiendaComponent implements OnInit {
  turnoTienda:any=[];
  turno:any=[];

  tienda:any=[];
  
  paginaActual:number=1;

  constructor(private http:HttpClient,private toastr: ToastrService) { }

  ngOnInit(): void {
    this.buscarTurno();
    this.buscarTienda();
    this.buscarTurnoTienda();
  }


  
  buscarTurnoTienda(){


    this.buscarRolServicio().subscribe(
      (response:any)=> this.turnoTienda=response

      
    )
    


  
  }

  buscarRolServicio():Observable<any>{
    return this.http.get<any>('http://localhost:6500/turnoTienda/buscar').pipe(
      catchError(e=> "error")
    )
  }



  buscarTurno(){

    this.buscarCursoServicio().subscribe(
      (response:any)=> this.turno=response

      
    )
  }

  buscarCursoServicio():Observable<any>{
    return this.http.get<any>('http://localhost:6500/turno/buscar').pipe(
      catchError(e=> "error")
    )
  }








editar(datos:any){
  console.log(datos.idprofesor);

  localStorage.setItem("editar",JSON.stringify(datos))
  location.href="/editarTurnoTienda";
}

  eliminar(datos:any){

   this.eliminarUsuarioServicio(datos.idTienda,datos.idTurno).subscribe(
      (response:any)=> this.confirmarEliminacion()
    )
  }
  
  confirmarEliminacion(){
    this.toastr.success('La asignación fue eliminada correctamente', 'Asignacion Eliminado',
    {positionClass:'toast-bottom-right'});
    this.buscarTurnoTienda();
  }
    eliminarUsuarioServicio(id:any,id2:any){
      return this.http.delete<any>('http://localhost:6500/turnoTienda/eliminar/'+id+'/'+id2).pipe(
        catchError(e=> "error")
      )
    }
    agregarBoton(){
      location.href="/creacionTurnoTienda";
      localStorage.removeItem("editar")
     
    }





    buscarTienda(){

      this.buscarTiendaServicio().subscribe(
        (response:any)=> this.tienda=response
  
        
      )
    }
  
    buscarTiendaServicio():Observable<any>{
      return this.http.get<any>('http://localhost:6500/tienda/buscar').pipe(
        catchError(e=> "error")
      )
    }

}
