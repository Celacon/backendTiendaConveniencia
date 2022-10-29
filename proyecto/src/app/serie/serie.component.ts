import { Component, OnInit } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {catchError} from 'rxjs/operators' 
import { HttpHeaders } from '@angular/common/http';
import { ToastrService } from 'ngx-toastr';
import { ActivatedRoute } from '@angular/router';
import { Observable } from 'rxjs';
import { FormBuilder, FormGroup,Validators } from '@angular/forms';
@Component({
  selector: 'app-serie',
  templateUrl: './serie.component.html',
  styleUrls: ['./serie.component.css']
})
export class SerieComponent implements OnInit {


  series:any={};
  loading=false;
  Llenar:boolean=false;
  Llenar2:boolean=true;
titulo='AGREGAR SERIE';
tituloBotonAgregar='AGREGAR';
  constructor(
    private fb: FormBuilder,
              private http:HttpClient,
              private toastr: ToastrService,
              private aRoute:ActivatedRoute
  )

{ }

  ngOnInit(): void {
    let temporal =localStorage.getItem("editar");

    if (temporal!=null){
      this.Llenar2=false;
      this.Llenar=true;
      this.titulo='EDITAR CLIENTE';
      this.tituloBotonAgregar='GUARDAR';
      this.series=JSON.parse(temporal|| '{}');
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
  return this.http.post<any>('http://localhost:6500/serie/guardar',this.series,httpOptions).pipe(
    catchError(e=> "error")
  )

}
confirmarCreacion(res:any){
  this.series={};
  
  this.loading=true;
  location.href="/consultaserie";
  this.toastr.success("El usuario fue creado correctamente con Idtienda  --"+res.idtienda+"-- y serie:  "+res.serie+"--", 'Serie Creada',
  {positionClass:'toast-bottom-right'});
  
}

volver(){
   location.href="/consultaserie";
   
   localStorage.removeItem("editar")
   
}
volverBienvenidaAdmin(){
 
  
  localStorage.removeItem("editar")
  location.href="/bienvenidaAdmin"

}




}
