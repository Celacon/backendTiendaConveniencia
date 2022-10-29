import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup,Validators } from '@angular/forms';

import {HttpClient} from '@angular/common/http';
import {catchError} from 'rxjs/operators' 
import { HttpHeaders } from '@angular/common/http';
import { ToastrService } from 'ngx-toastr';
import { Observable } from 'rxjs';

@Component({
  selector: 'app-creacion-turno',
  templateUrl: './creacion-turno.component.html',
  styleUrls: ['./creacion-turno.component.css']
})
export class CreacionTurnoComponent implements OnInit {

  turno:any={};

  Llenar2:boolean=false;
  loading=false;
  
  titulo='TURNO ';
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
      
      this.titulo='EDITAR TURNO';
      this.tituloBotonAgregar='GUARDAR';
      this.turno=JSON.parse(temporal|| '{}');
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
  return this.http.post<any>('http://localhost:6500/turno/guardar',this.turno,httpOptions).pipe(
    catchError(e=> "error")
  )
  
  }


confirmarCreacion(res:any){
this.turno={};

this.loading=true;
location.href="/consultaTurno";
this.toastr.success("El turno fue creado", 'DOCUMENTO CREADO',
{positionClass:'toast-bottom-right'});

}

volver(){
 location.href="/consultaTurno";
 
 localStorage.removeItem("editar")
 
}
volverBienvenidaAdmin(){


localStorage.removeItem("editar")
location.href="/bienvenidaAdmin"

}

}
