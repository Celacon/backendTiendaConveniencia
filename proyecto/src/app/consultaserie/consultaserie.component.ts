import { Component, OnInit } from '@angular/core';
import {HttpClient, HttpHeaders} from '@angular/common/http';
import {catchError} from 'rxjs/operators' 
import { Observable } from 'rxjs';
import { ToastrService } from 'ngx-toastr';
@Component({
  selector: 'app-consultaserie',
  templateUrl: './consultaserie.component.html',
  styleUrls: ['./consultaserie.component.css']
})
export class ConsultaserieComponent implements OnInit {

  series:any=[];  
  serieb:any=[];
  paginaActual:number=1;

  constructor(private http:HttpClient,private toastr: ToastrService) { }

  ngOnInit(): void {

    this.buscarUsuarios();
  }

  buscarUsuarios(){


    this.buscarUsuariosServicio().subscribe(
      (response:any)=> this.series=response

      
    )
  }

  buscarUsuariosServicio():Observable<any>{
    return this.http.get<any>('http://localhost:6500/serie/buscar').pipe(
      catchError(e=> "error")
    )
  }
  
editar(series:any){
  console.log(series.idSerie);

  localStorage.setItem("editar",JSON.stringify(series))
  location.href="/editarserie";
}

  eliminar(series:any){

   this.eliminarUsuarioServicio(series.idSerie).subscribe(
      (response:any)=> this.confirmarEliminacion()
    )
  }
  
  confirmarEliminacion(){
    this.toastr.success('Serie fue eliminado Correctamente', 'Serie Eliminado',
    {positionClass:'toast-bottom-right'});
    this.buscarUsuarios()
  }
    eliminarUsuarioServicio(id:any){
      return this.http.delete<any>('http://localhost:6500/serie/eliminar/'+id).pipe(
        catchError(e=> "error")
      )
    }
    agregarBoton(){
      location.href="/serie";
      localStorage.removeItem("editar")
     
    }
  




 buscar(){
   if(this.series.idSerie==null||this.series.serie==null){

  
    this.toastr.success('Debe de llenar ambos campos ', 'Serie Eliminado');
   }else{
    this.buscarUsu(this.serieb).subscribe(
  
      (response:any)=> this.serieb=response)
   
   }


     
     
    
  
     
     
    }


    
  
    buscarUsu(usu:any):Observable<any>{
      return this.http.get<any>('http://localhost:3031/profesor/prof/'+usu.nombreProfesor+"/"+usu.apellidoProfesor).pipe(
        catchError(e=> "error")
      )
    }
  

}
