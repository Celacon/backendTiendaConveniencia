import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup,Validators } from '@angular/forms';
import {HttpClient} from '@angular/common/http';
import {catchError} from 'rxjs/operators' 
import { HttpHeaders } from '@angular/common/http';
import { ToastrService } from 'ngx-toastr';
import { ActivatedRoute } from '@angular/router';
import { Observable } from 'rxjs';

@Component({
  selector: 'app-creacion-empleado2',
  templateUrl: './creacion-empleado2.component.html',
  styleUrls: ['./creacion-empleado2.component.css']
})
export class CreacionEmpleado2Component implements OnInit {

  empleado:any={};
  persona:any={};
  Llenar:boolean=false;
  Llenar2:boolean=true;
loading=false;
tipoDocumento:any=[];

  constructor(
    private fb: FormBuilder,
    private http:HttpClient,
    private toastr: ToastrService,
    private aRoute:ActivatedRoute

  ) { }

  ngOnInit(): void {
    this.buscarTipoDocumento();

  }

  
  agregarEmpleado(){


    let formularioValido:any = document. getElementById("creacionForm");
    if(formularioValido.reportValidity()){
      this.servicioCrear().subscribe(
        (respuesta: any)=> this.confirmarCreacion(respuesta)

      )
  }
}

servicioCrear(){
this.empleado.persona=this.persona;
 
  


  

var httpOptions ={
  headers: new HttpHeaders({
    'Content-Type':'application/json'
  })
} 
return this.http.post<any>('http://localhost:6500/empleado/guardar',this.empleado,httpOptions).pipe(
  catchError(e=> "error")
)

}
confirmarCreacion(res:any){
this.empleado={};

this.loading=true;
location.href="/consultaEmpleado";


}

volver(){
 location.href="/consultaEmpleado";
 
 localStorage.removeItem("editar")
 
}
volverBienvenidaAdmin(){


localStorage.removeItem("editar")
location.href="/bienvenidaAdmin"

}


buscarTipoDocumento(){

  this.buscarTipoDocumentoServicio().subscribe(
    (response:any)=> this.tipoDocumento=response

    
  )
}

buscarTipoDocumentoServicio():Observable<any>{
  return this.http.get<any>('http://localhost:6500/tipoDocumento/buscar').pipe(
    catchError(e=> "error")
  )
}

}
