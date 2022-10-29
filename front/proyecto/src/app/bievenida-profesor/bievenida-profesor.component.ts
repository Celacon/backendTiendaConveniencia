import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup,Validators } from '@angular/forms';

import {HttpClient} from '@angular/common/http';
import {catchError} from 'rxjs/operators' 
import { HttpHeaders } from '@angular/common/http';
import { ToastrService } from 'ngx-toastr';
import { ActivatedRoute } from '@angular/router';



@Component({
  selector: 'app-bievenida-profesor',
  templateUrl: './bievenida-profesor.component.html',
  styleUrls: ['./bievenida-profesor.component.css']
})
export class BievenidaProfesorComponent implements OnInit {
  usuario:any={};
  editar:boolean=false;
  loading=false;
  Llenar:any=false;
  constructor(private fb: FormBuilder,
    private http:HttpClient,
    private toastr: ToastrService,
    private aRoute:ActivatedRoute) { }

  ngOnInit(): void {


    this.llenar2();
   
  }
  llenar2(){let temporal =localStorage.getItem("usu");

  if (temporal){
    this.usuario=JSON.parse(temporal|| '{}');
  }else{
    location.href="/";

  }}

  
  salir(){

    localStorage.removeItem("usu")

    location.href="/";
  }
 
  editarProfesor(){


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
return this.http.post<any>('http://localhost:3031/profesor/guardar',this.usuario,httpOptions).pipe(
  catchError(e=> "error")
)

}
confirmarCreacion(res:any){
this.usuario={};


this.Llenar=false;
this.toastr.success("El usuario fue Editado correctamente con Usuario  --"+res.usuario+"-- y Password:  "+res.password+"--", 'Profesor Creado',
{positionClass:'toast-bottom-right'});

localStorage.setItem("usu",JSON.stringify(res))
this.llenar2();
}
botonEditar(){
  this.Llenar=true;
}
cancelar(){
  this.Llenar=false;
}

}
