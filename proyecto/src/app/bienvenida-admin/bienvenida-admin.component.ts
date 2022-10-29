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

  creacionProducto(){
    location.href="/creacionProducto";
        localStorage.removeItem("editar")
  }

creacionAlumno(){
  location.href="/creacionAlumno";
      localStorage.removeItem("editar")
}
creacionProfesor(){
  location.href="/creacionProfesor";
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
