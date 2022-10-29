import { Component, OnInit } from '@angular/core';
import {HttpClient, HttpHeaders} from '@angular/common/http';
import {catchError} from 'rxjs/operators' 
import { Observable } from 'rxjs';
import { ToastrService } from 'ngx-toastr';

@Component({
  selector: 'app-consulta-tipo-ubicacion',
  templateUrl: './consulta-tipo-ubicacion.component.html',
  styleUrls: ['./consulta-tipo-ubicacion.component.css']
})
export class ConsultaTipoUbicacionComponent implements OnInit {
  tubicaicones:any=[];
  paginaActual:number=1;
  constructor(private http:HttpClient,private toastr: ToastrService) { }

  ngOnInit(): void {
    this.buscarTipoUbicaciones();
  }
  buscarTipoUbicaciones(){

    this.buscarTipoUbicacionServicio().subscribe(
      (response:any)=> this.tubicaicones=response
    )
   
  }

  buscarTipoUbicacionServicio():Observable<any>{
    return this.http.get<any>('http://localhost:6500/tipoUbicacion/buscar').pipe(
      catchError(e=> "error")
    )
  }
  
  
editar(datos:any){
  localStorage.setItem("editar",JSON.stringify(datos))
  location.href="/editarTipoUbicaciones";
}

  eliminar(datos:any){

   this.eliminarTipoUbicacionServicio(datos.idProducto).subscribe(
      (response:any)=> this.confirmarEliminacion()
    )
  }
  
  confirmarEliminacion(){
    this.toastr.success('El tipo Ubicacion fue eliminado Correctamente', 'tipo Ubicacion Eliminado',
    {positionClass:'toast-bottom-right'});
    this.buscarTipoUbicaciones()
  }

  eliminarTipoUbicacionServicio(id:any){
      return this.http.delete<any>('http://localhost:6500/tipoUbicacion/eliminar/'+id).pipe(
        catchError(e=> "error")
      )
    }

    agregarBoton(){
      location.href="/creacionProducto";
      localStorage.removeItem("editar")
     
    }

}
