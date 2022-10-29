import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup,Validators } from '@angular/forms';

import {HttpClient} from '@angular/common/http';
import {catchError} from 'rxjs/operators' 
import { HttpHeaders } from '@angular/common/http';
import { ToastrService } from 'ngx-toastr';
import { Observable } from 'rxjs';


@Component({
  selector: 'app-asignar-usuario-turno',
  templateUrl: './asignar-usuario-turno.component.html',
  styleUrls: ['./asignar-usuario-turno.component.css']
})
export class AsignarUsuarioTurnoComponent implements OnInit {

  asignaciones:any={};

  asignacionUsuario:any={};

  empleado:any=[];

  momentaneo:any={};
  momentaneo2:any={};

  
  empleadoB:any=[];
  empleadoC:any=[];
  cursos:any=[];

  turno:any={};

  tienda:any=[];
  rol:any=[];
  status:any=[];
  turnoTienda:any=[];

 
  Llenar2:boolean=false;
loading=false;

titulo='AGREGAR USUARIO TURNO';
tituloBotonAgregar='AGREGAR';

  constructor(private fb: FormBuilder,
    private http:HttpClient,
    private toastr: ToastrService) { }

  ngOnInit(): void {


    
      
    this.buscarTurnoTienda()
    this.buscarStatus()
    
    this.buscarRol()
    

    

    
    let temporal =localStorage.getItem("editar");

    if (temporal!=null){
      this.Llenar2=true;
      
      this.titulo='EDITAR USUARIO TURNO';
      this.tituloBotonAgregar='GUARDAR';
      this.asignaciones=JSON.parse(temporal);
      this.asignacionUsuario=this.asignaciones.persona;
      this.buscarEmpleadoID2(this.asignaciones.idEmpleado);
      this.buscarUsuarioID2(this.asignacionUsuario.idPersona);
      this.asignaciones.idTienda=this.momentaneo.idTienda;
      this.asignaciones.idTienda=this.momentaneo.idTurno;
      console.log(this.asignaciones);
      
    }
  }

  agregarAsignacion(){


    let formularioValido:any = document. getElementById("creacionForm22");

    let formularioValido11:any = document. getElementById("creacionForm");
    if(formularioValido.reportValidity()&&formularioValido11.reportValidity()){
      this.servicioCrear().subscribe(
        (respuesta: any)=> this.confirmarCreacion(respuesta));
        this.servicioTurnoTienda().subscribe(
          (respuesta: any)=> this.confirmarCreacion(respuesta))
  }else{

    window.alert("aun no ha llenado todos los campos");
  }
}

servicioCrear(){

  console.log(this.asignacionUsuario);

var httpOptions ={
  headers: new HttpHeaders({
    'Content-Type':'application/json'
  })
} 
return this.http.post<any>('http://localhost:6500/usuario/grabar',this.asignacionUsuario,httpOptions).pipe(
  catchError(e=> "error")
)

}




servicioTurnoTienda(){

  this.asignaciones.idTurno=this.asignaciones.idTienda.idTurno;
  this.asignaciones.idTienda=this.asignaciones.idTienda.idTienda;


var httpOptions ={
headers: new HttpHeaders({
  'Content-Type':'application/json'
})
} 
return this.http.post<any>('http://localhost:6500/turnoTiendaEmpleado/guardar',this.asignaciones,httpOptions).pipe(
catchError(e=> "error")
)

}





confirmarCreacion(res:any){



}







volver(){
  location.href="/consultaEmpleado";
  
  localStorage.removeItem("editar")
  
 }


 volverBienvenidaAdmin(){
 
 
 localStorage.removeItem("editar")
 location.href="/bienvenidaAdmin"
 
 }









buscarRol(){
 
  this.buscarRolServicio().subscribe(
    (response:any)=> this.rol=response

    
  )
}

buscarRolServicio():Observable<any>{
  return this.http.get<any>('http://localhost:6500/rol/buscar').pipe(
    catchError(e=> "error")
  )

  
}

buscarStatus(){
 
  this.buscarStatusServicio().subscribe(
    (response:any)=> this.status=response

    
  )
}

buscarStatusServicio():Observable<any>{
  return this.http.get<any>('http://localhost:6500/status/buscar').pipe(
    catchError(e=> "error")
  )

  
}

buscarTurnoTienda(){
 
  this.buscarTurnoTiendaServicio().subscribe(
    (response:any)=> this.turnoTienda=response
   //(response:any)=> console.log(response)
    
  )
  
}

buscarTurnoTiendaServicio():Observable<any>{
  return this.http.get<any>('http://localhost:6500/vTurnoTienda/buscar').pipe(
    catchError(e=> "error")
  )

  
}







 buscarEmpleadoID2(id:any){



  this.buscarEmpleadoIDServicio(id).subscribe(

    (response:any)=> this.momentaneo=response)
   //(response:any)=> console.log(response))
   console.log(this.momentaneo);

 }



buscarEmpleadoIDServicio(id:any):Observable<any>{
 return this.http.get<any>('http://localhost:6500/turnoTiendaEmpleado/buscar/por/'+id).pipe(
   catchError(e=> "error")
 )
}


buscarUsuarioID2(id:any){



  this.buscarUsuarioServicio(id).subscribe(

    (response:any)=> this.momentaneo2=response)
 //   (response:any)=> console.log(response))
 console.log(this.momentaneo2);
 
 }



buscarUsuarioServicio(id:any):Observable<any>{
 return this.http.get<any>('http://localhost:6500/usuario/buscar/por/'+id).pipe(
   catchError(e=> "error")
 )
}









}
