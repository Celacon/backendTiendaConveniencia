import { Component, OnInit } from '@angular/core';



@Component({
  selector: 'app-bienvenida-admin',
  templateUrl: './bienvenida-admin.component.html',
  styleUrls: ['./bienvenida-admin.component.css']
})
export class BienvenidaAdminComponent implements OnInit {

  usuario:any={};
  constructor() { }

  ngOnInit(): void {
    let temporal =localStorage.getItem("usu");

    if (temporal){
      this.usuario=JSON.parse(temporal|| '{}');
    }else{
      location.href="/";

    }
  
  }
  
  salir(){

    localStorage.removeItem("usu")
    localStorage.removeItem("editar")
    location.href="/";
  }


creacionDocumento(){
  location.href="/creacionTipoDocumento";
      localStorage.removeItem("editar")
}
creacionPersona(){
  location.href="/creacionPersona";
      localStorage.removeItem("editar")
}
creacionEmpleado(){
  location.href="/creacionEmpleado";
      localStorage.removeItem("editar")
}
creacionCurso(){
  location.href="/creacionCurso";
      localStorage.removeItem("editar")
}

creacionAsignaciones(){
  location.href="/creacionAsignacion";
      localStorage.removeItem("editar")
}



}
