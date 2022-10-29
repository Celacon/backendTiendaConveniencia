import { Component, OnInit } from '@angular/core';
import {HttpClient, HttpHeaders} from '@angular/common/http';
import {catchError} from 'rxjs/operators' 
import { Observable } from 'rxjs';
import { ToastrService } from 'ngx-toastr';

@Component({
  selector: 'app-consulta-presentacion',
  templateUrl: './consulta-presentacion.component.html',
  styleUrls: ['./consulta-presentacion.component.css']
})
export class ConsultaPresentacionComponent implements OnInit {

  presentaciones:any=[];
  paginaActual:number=1;

  constructor(private http:HttpClient,private toastr: ToastrService) { }

  ngOnInit(): void {
    this.buscarPresentaciones();
  }
  buscarPresentaciones(){

    this.buscarPresentacionServicio().subscribe(
      (response:any)=> this.presentaciones=response
    )
   
  }

  buscarPresentacionServicio():Observable<any>{
    return this.http.get<any>('http://localhost:6500/presentacion/buscar').pipe(
      catchError(e=> "error")
    )
  }
  
  
editar(datos:any){
  localStorage.setItem("editar",JSON.stringify(datos))
  location.href="/editarPresentacion";
}

  eliminar(datos:any){

   this.eliminarPresentacionServicio(datos.idPresentacion).subscribe(
      (response:any)=> this.confirmarEliminacion()
    )
  }
  
  confirmarEliminacion(){
    this.toastr.success('La Presentacion fue eliminada Correctamente', 'Presentacion Eliminada',
    {positionClass:'toast-bottom-right'});
    this.buscarPresentaciones()
  }

  eliminarPresentacionServicio(id:any){
      return this.http.delete<any>('http://localhost:6500/presentacion/eliminar/'+id).pipe(
        catchError(e=> "error")
      )
    }

    agregarBoton(){
      location.href="/creacionPresentacion";
      localStorage.removeItem("editar")
     
    }

}
