import { Component, OnInit } from '@angular/core';
import {HttpClient, HttpHeaders} from '@angular/common/http';
import {catchError} from 'rxjs/operators' 
import { Observable } from 'rxjs';
import { ToastrService } from 'ngx-toastr';

@Component({
  selector: 'app-consulta-turno',
  templateUrl: './consulta-turno.component.html',
  styleUrls: ['./consulta-turno.component.css']
})
export class ConsultaTurnoComponent implements OnInit {
  turno:any=[];  
  usuariosB:any=[];
  paginaActual:number=1;


  constructor(private http:HttpClient,private toastr: ToastrService) { }

  ngOnInit(): void {
    this.buscarTurno();
  }

  
  buscarTurno(){


    this.buscarRolServicio().subscribe(
      (response:any)=> this.turno=response

      
    )
  }

  buscarRolServicio():Observable<any>{
    return this.http.get<any>('http://localhost:6500/turno/buscar').pipe(
      catchError(e=> "error")
    )
  }



  editar(datos:any){

  
    localStorage.setItem("editar",JSON.stringify(datos))
    location.href="/editarTurno";
  }
  
    eliminar(datos:any){
  
     this.eliminarTipoDocumentoServicio(datos.idTurno).subscribe(
        (response:any)=> this.confirmarEliminacion()
      )
    }
    
    confirmarEliminacion(){
      this.toastr.success('el Turno fue eliminado', 'Documento Eliminado',
      {positionClass:'toast-bottom-right'});
      this.buscarTurno()
    }

      eliminarTipoDocumentoServicio(id:any){
        return this.http.delete<any>('http://localhost:6500/turno/eliminar/'+id).pipe(
          catchError(e=> "error")
        )
      }
      agregarBoton(){
        location.href="/creacionTurno";
        localStorage.removeItem("editar")
       
      }


}
