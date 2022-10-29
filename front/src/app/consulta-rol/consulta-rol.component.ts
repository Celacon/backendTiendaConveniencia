import { Component, OnInit } from '@angular/core';
import {HttpClient, HttpHeaders} from '@angular/common/http';
import {catchError} from 'rxjs/operators' 
import { Observable } from 'rxjs';
import { ToastrService } from 'ngx-toastr';

@Component({
  selector: 'app-consulta-rol',
  templateUrl: './consulta-rol.component.html',
  styleUrls: ['./consulta-rol.component.css']
})
export class ConsultaRolComponent implements OnInit {

  rol:any={};  
  usuariosB:any=[];
  paginaActual:number=1;

  constructor(private http:HttpClient,private toastr: ToastrService) { }

  ngOnInit(): void {
    this.buscarRol();
  }


  buscarRol(){


    this.buscarRolServicio().subscribe(
      (response:any)=> this.rol=response

      
    )

    console.log(this.rol);
  }

  buscarRolServicio():Observable<any>{
    return this.http.get<any>('http://localhost:6500/rol/buscar').pipe(
      catchError(e=> "error")
    )
  }



  editar(datos:any){

  
    localStorage.setItem("editar",JSON.stringify(datos))
    location.href="/editarRol";
  }
  
    eliminar(datos:any){
  
     this.eliminarTipoDocumentoServicio(datos.idRol).subscribe(
        (response:any)=> this.confirmarEliminacion()
      )
    }
    
    confirmarEliminacion(){
      this.toastr.success('el documento fue eliminado', 'Documento Eliminado',
      {positionClass:'toast-bottom-right'});
      this.buscarRol()
    }

      eliminarTipoDocumentoServicio(id:any){
        return this.http.delete<any>('http://localhost:6500/rol/eliminar/'+id).pipe(
          catchError(e=> "error")
        )
      }
      agregarBoton(){
        location.href="/creacionRol";
        localStorage.removeItem("editar")
       
      }


}
