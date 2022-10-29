import { Component, OnInit } from '@angular/core';
import {HttpClient, HttpHeaders} from '@angular/common/http';
import {catchError} from 'rxjs/operators' 
import { Observable } from 'rxjs';
import { ToastrService } from 'ngx-toastr';

@Component({
  selector: 'app-consultar-tipodocumento',
  templateUrl: './consultar-tipodocumento.component.html',
  styleUrls: ['./consultar-tipodocumento.component.css']
})
export class ConsultarTipodocumentoComponent implements OnInit {

  
  tipoDocumento:any=[];  
  usuariosB:any=[];
  paginaActual:number=1;
 
 

  constructor(private http:HttpClient,private toastr: ToastrService) { }

  ngOnInit(): void {
    this.buscarDocumento();
  }


  buscarDocumento(){


    this.buscarTipoDocumentoServicio().subscribe(
      (response:any)=> this.tipoDocumento=response

      
    )
  }

  buscarTipoDocumentoServicio():Observable<any>{
    return this.http.get<any>('http://localhost:6500/tipoDocumento/buscar').pipe(
      catchError(e=> "error")
    )
  }



  editar(datos:any){

  
    localStorage.setItem("editar",JSON.stringify(datos))
    location.href="/editarTipoDocumento";
  }
  
    eliminar(datos:any){
  
     this.eliminarTipoDocumentoServicio(datos.idTipoDocumento).subscribe(
        (response:any)=> this.confirmarEliminacion()
      )
    }
    
    confirmarEliminacion(){
      this.toastr.success('el documento fue eliminado', 'Documento Eliminado',
      {positionClass:'toast-bottom-right'});
      this.buscarDocumento()
    }

      eliminarTipoDocumentoServicio(id:any){
        return this.http.delete<any>('http://localhost:6500/tipoDocumento/eliminar/'+id).pipe(
          catchError(e=> "error")
        )
      }
      agregarBoton(){
        location.href="/creacionTipoDocumento";
        localStorage.removeItem("editar")
       
      }

}
