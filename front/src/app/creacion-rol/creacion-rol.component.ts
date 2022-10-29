import { Component, OnInit } from '@angular/core';

import { FormBuilder, FormGroup,Validators } from '@angular/forms';

import {HttpClient} from '@angular/common/http';
import {catchError} from 'rxjs/operators' 
import { HttpHeaders } from '@angular/common/http';
import { ToastrService } from 'ngx-toastr';
import { Observable } from 'rxjs';


@Component({
  selector: 'app-creacion-rol',
  templateUrl: './creacion-rol.component.html',
  styleUrls: ['./creacion-rol.component.css']
})
export class CreacionRolComponent implements OnInit {
  rol:any={};

  Llenar2:boolean=false;
  loading=false;
  
  titulo='AGREGAR rol';
  tituloBotonAgregar='AGREGAR';

  constructor(
    private fb: FormBuilder,
    private http:HttpClient,
    private toastr: ToastrService
  ) { }

  ngOnInit(): void {

    let temporal =localStorage.getItem("editar");

    if (temporal!=null){
      this.Llenar2=true;
      
      this.titulo='EDITAR rol';
      this.tituloBotonAgregar='GUARDAR';
      this.rol=JSON.parse(temporal|| '{}');
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
  return this.http.post<any>('http://localhost:6500/rol/guardar',this.rol,httpOptions).pipe(
    catchError(e=> "error")
  )
  
  }


confirmarCreacion(res:any){
this.rol={};

this.loading=true;
location.href="/consultaRol";
this.toastr.success("El rol fue creado", 'DOCUMENTO CREADO',
{positionClass:'toast-bottom-right'});

}

volver(){
 location.href="/consultaRol";
 
 localStorage.removeItem("editar")
 
}
volverBienvenidaAdmin(){


localStorage.removeItem("editar")
location.href="/bienvenidaAdmin"

}



}
