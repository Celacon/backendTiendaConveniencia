import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup,Validators } from '@angular/forms';

import {HttpClient} from '@angular/common/http';
import {catchError} from 'rxjs/operators' 
import { HttpHeaders } from '@angular/common/http';
import { ToastrService } from 'ngx-toastr';

import { Observable } from 'rxjs';

@Component({
  selector: 'app-creacion-turno-tienda',
  templateUrl: './creacion-turno-tienda.component.html',
  styleUrls: ['./creacion-turno-tienda.component.css']
})
export class CreacionTurnoTiendaComponent implements OnInit {

  turnoTienda:any={};

  turno:any=[];
  tienda:any=[];

  
  Llenar2:boolean=false;
loading=false;

titulo='ASIGNAR TURNO A UNA TIENDA';
tituloBotonAgregar='AGREGAR';

  constructor(private fb: FormBuilder,
    private http:HttpClient,
    private toastr: ToastrService) { }

  ngOnInit(): void {
    this.buscarTurno();
    this.buscarTienda();
    
    let temporal =localStorage.getItem("editar");

    if (temporal!=null){
      this.Llenar2=true;
      
      this.titulo='EDITAR CURSO';
      this.tituloBotonAgregar='GUARDAR';
      this.turnoTienda=JSON.parse(temporal|| '{}');
      console.log(this.turnoTienda);
    }
  }


  agregarAsignacion(){


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
return this.http.post<any>('http://localhost:6500/turnoTienda/guardar',this.turnoTienda,httpOptions).pipe(
  catchError(e=> "error")
)

}
confirmarCreacion(res:any){
this.turnoTienda={};

this.loading=true;
location.href="/consutaTurnoTienda";
this.toastr.success("La asignacion de turno a tienda fue creada", 'Curso Creado',
{positionClass:'toast-bottom-right'});

}

volver(){
 location.href="/consutaTurnoTienda";
 
 localStorage.removeItem("editar")
 
}
volverBienvenidaAdmin(){


localStorage.removeItem("editar")
location.href="/bienvenidaAdmin"

}


buscarTurno(){

  this.buscarCursoServicio().subscribe(
    (response:any)=> this.turno=response

    
  )
}

buscarCursoServicio():Observable<any>{
  return this.http.get<any>('http://localhost:6500/turno/buscar').pipe(
    catchError(e=> "error")
  )
}







buscarTienda(){

  this.buscarTiendaServicio().subscribe(
    (response:any)=> this.tienda=response

    
  )
}

buscarTiendaServicio():Observable<any>{
  return this.http.get<any>('http://localhost:6500/tienda/buscar').pipe(
    catchError(e=> "error")
  )
}






}
