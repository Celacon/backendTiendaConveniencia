import { Component, OnInit } from '@angular/core';
import {HttpClient, HttpHeaders} from '@angular/common/http';
import {catchError} from 'rxjs/operators' 
import { Observable } from 'rxjs';
import { ToastrService } from 'ngx-toastr';


@Component({
  selector: 'app-consultapagos',
  templateUrl: './consultapagos.component.html',
  styleUrls: ['./consultapagos.component.css']
})
export class ConsultapagosComponent implements OnInit {

  
  tipopago:any=[];  
  tipopagob:any=[];
  paginaActual:number=1;

  constructor(private http:HttpClient,private toastr: ToastrService) { }

  ngOnInit(): void {
    this.buscarUsuarios();
  }
  buscarUsuarios(){


    this.buscarUsuariosServicio().subscribe(
      (response:any)=> this.tipopago=response

      
    )
  }

  buscarUsuariosServicio():Observable<any>{
    return this.http.get<any>('http://localhost:6500/tipopago/buscar').pipe(
      catchError(e=> "error")
    )
  }
  
editar(tipopagos:any){
  console.log(tipopagos.idTipoPago);

  localStorage.setItem("editar",JSON.stringify(tipopagos))
  location.href="/editarpago";
}

  eliminar(tipopago:any){

   this.eliminarUsuarioServicio(tipopago.idTipoPago).subscribe(
      (response:any)=> this.confirmarEliminacion()
    )
  }
  
  confirmarEliminacion(){
    this.toastr.success('Tipo de pago fue eliminado Correctamente', 'Pago Eliminado',
    {positionClass:'toast-bottom-right'});
    this.buscarUsuarios()
  }
    eliminarUsuarioServicio(id:any){
      return this.http.delete<any>('http://localhost:6500/tipopago/eliminar/'+id).pipe(
        catchError(e=> "error")
      )
    }
    agregarBoton(){
      location.href="/tipopago";
      localStorage.removeItem("editar")
     
    }
  




 buscar(){
   if(this.tipopago.idTipoPago==null||this.tipopagob.tipopago==null){

  
    this.toastr.success('Debe de llenar ambos campos ', 'Cliente Eliminado');
   }else{
    this.buscarUsu(this.tipopago).subscribe(
  
      (response:any)=> this.tipopagob=response)
   
   }


     
     
    
  
     
     
    }


    
  
    buscarUsu(usu:any):Observable<any>{
      return this.http.get<any>('http://localhost:3031/profesor/prof/'+usu.nombreProfesor+"/"+usu.apellidoProfesor).pipe(
        catchError(e=> "error")
      )
    }
  


}


