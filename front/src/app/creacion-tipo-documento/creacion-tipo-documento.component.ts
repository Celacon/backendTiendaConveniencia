import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup,Validators } from '@angular/forms';

import {HttpClient} from '@angular/common/http';
import {catchError} from 'rxjs/operators' 
import { HttpHeaders } from '@angular/common/http';
import { ToastrService } from 'ngx-toastr';
import { Observable } from 'rxjs';


@Component({
  selector: 'app-creacion-tipo-documento',
  templateUrl: './creacion-tipo-documento.component.html',
  styleUrls: ['./creacion-tipo-documento.component.css']
})
export class CreacionTipoDocumentoComponent implements OnInit {

  documentos:any={};



  

 
  Llenar2:boolean=false;
loading=false;

titulo='AGREGAR DOCUMENTO';
tituloBotonAgregar='AGREGAR';

  constructor(private fb: FormBuilder,
    private http:HttpClient,
    private toastr: ToastrService) { }

  ngOnInit(): void {


    
    let temporal =localStorage.getItem("editar");

    if (temporal!=null){
      this.Llenar2=true;
      
      this.titulo='EDITAR DOCUMENTO';
      this.tituloBotonAgregar='GUARDAR';
      this.documentos=JSON.parse(temporal|| '{}');
    }
  }

  agregarDocumento(){


    let formularioValido:any = document. getElementById("creacionForm");
console.log(formularioValido)
    if(formularioValido.reportValidity()){
      this.servicioCrear().subscribe(
        (respuesta: any)=> this.confirmarCreacion(respuesta)

      )
  }
}

servicioCrear(){

  var httpOptions ={
    headers: new HttpHeaders({
      'Content-Type':'application/json'
    })
  } 
  return this.http.post<any>('http://localhost:6500/tipoDocumento/guardar',this.documentos,httpOptions).pipe(
    catchError(e=> "error")
  )
  
  }


confirmarCreacion(res:any){
this.documentos={};

this.loading=true;
location.href="/consultaTipoDocumento";
this.toastr.success("El documento fue creado", 'DOCUMENTO CREADO',
{positionClass:'toast-bottom-right'});

}

volver(){
 location.href="/consultaTipoDocumento";
 
 localStorage.removeItem("editar")
 
}
volverBienvenidaAdmin(){


localStorage.removeItem("editar")
location.href="/bienvenidaAdmin"

}










}
