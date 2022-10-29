import { Component, OnInit } from '@angular/core';

import { FormBuilder, FormGroup,Validators } from '@angular/forms';

import {HttpClient} from '@angular/common/http';
import {catchError} from 'rxjs/operators' 
import { HttpHeaders } from '@angular/common/http';
import { ToastrService } from 'ngx-toastr';
import { ActivatedRoute } from '@angular/router';
import { Observable } from 'rxjs';

@Component({
  selector: 'app-cliente',
  templateUrl: './cliente.component.html',
  styleUrls: ['./cliente.component.css']
})
export class ClienteComponent implements OnInit {

  cliente:any={};
  loading=false;
  Llenar:boolean=false;
  Llenar2:boolean=true;
titulo='AGREGAR CLIENTE Y PERSONA';
tituloBotonAgregar='AGREGAR';
  constructor(
    private fb: FormBuilder,
              private http:HttpClient,
              private toastr: ToastrService,
              private aRoute:ActivatedRoute
  ) { }

  ngOnInit(): void {

    let temporal =localStorage.getItem("editar");

    if (temporal!=null){
      this.Llenar2=false;
      this.Llenar=true;
      this.titulo='EDITAR CLIENTE';
      this.tituloBotonAgregar='GUARDAR';
      this.cliente=JSON.parse(temporal|| '{}');
    }

  }
  agregarcp (){


    let formularioValido:any = document. getElementById("creacionForm");
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
  return this.http.post<any>('http://localhost:6500/cliente/guardar',this.cliente,httpOptions).pipe(
    catchError(e=> "error")
  )

}
confirmarCreacion(res:any){
  this.cliente={};
  
  this.loading=true;
  location.href="/consultacliente";
  this.toastr.success("El usuario fue creado correctamente con Cliente  --"+res.idPersona+"-- y Persona:  "+res.idCliente+"--", 'cliente Creado',
  {positionClass:'toast-bottom-right'});
  
}

volver(){
   location.href="/consultacliente";
   
   localStorage.removeItem("editar")
   
}
volverBienvenidaAdmin(){
 
  
  localStorage.removeItem("editar")
  location.href="/bienvenidaAdmin"

}






}
