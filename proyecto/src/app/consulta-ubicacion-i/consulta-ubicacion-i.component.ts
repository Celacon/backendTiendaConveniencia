import { Component, OnInit } from '@angular/core';
import {HttpClient, HttpHeaders} from '@angular/common/http';
import {catchError} from 'rxjs/operators' 
import { Observable } from 'rxjs';
import { ToastrService } from 'ngx-toastr';

@Component({
  selector: 'app-consulta-ubicacion-i',
  templateUrl: './consulta-ubicacion-i.component.html',
  styleUrls: ['./consulta-ubicacion-i.component.css']
})
export class ConsultaUbicacionIComponent implements OnInit {

  ubicacionesI:any=[];
  paginaActual:number=1;

  constructor(private http:HttpClient,private toastr: ToastrService) { }

  ngOnInit(): void {
    this.buscarUbicaciones();
  }

  buscarUbicaciones(){

    this.buscarUbicacionesServicio().subscribe(
      (response:any)=> this.ubicacionesI=response)
  }

  buscarUbicacionesServicio():Observable<any>{
    return this.http.get<any>('http://localhost:6500/ubicacion/buscar').pipe(
      catchError(e=> "error")
    )
  }

  editar(datos:any){
    localStorage.setItem("editar",JSON.stringify(datos))
    location.href="/editarUbicacion";
  }

  eliminar(datos:any){

    this.eliminarUbicacionServicio(datos.idUbicacion).subscribe(
       (response:any)=> this.confirmarEliminacion()
     )
   }
   
   confirmarEliminacion(){
     this.toastr.success('La ubicacion fue eliminada Correctamente', 'Ubicacion Eliminada',
     {positionClass:'toast-bottom-right'});
     this.buscarUbicaciones()
   }
   eliminarUbicacionServicio(id:any){
       return this.http.delete<any>('http://localhost:6500/ubicacion/eliminar/'+id).pipe(
         catchError(e=> "error")
       )
     }
     agregarBoton(){
       location.href="/creacionUbicacion";
       localStorage.removeItem("editar")
      
     }

}
