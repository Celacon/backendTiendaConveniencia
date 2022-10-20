import { Component, OnInit } from '@angular/core';
import {HttpClient, HttpHeaders} from '@angular/common/http';
import {catchError} from 'rxjs/operators' 
import { Observable } from 'rxjs';
import { ToastrService } from 'ngx-toastr';


@Component({
  selector: 'app-cursos-asignados',
  templateUrl: './cursos-asignados.component.html',
  styleUrls: ['./cursos-asignados.component.css']
})
export class CursosAsignadosComponent implements OnInit {
  usuario:any={};
  
  usuarios3:any={};
  
  usuario2:number=0;
  
  paginaActual:number=1;
    constructor(private http:HttpClient,private toastr: ToastrService) { 
      let temporal =localStorage.getItem("usu");

      if (temporal!=null){
       
        this.usuario=JSON.parse(temporal|| '{}');
     
      this.usuario2=this.usuario.idprofesor;
      
      
      }
    
      console.log(this.usuario);
  this.buscar(this.usuario2)
 
    }

  ngOnInit(): void {
   


  }

 
  


  buscar(dato:number){

    this.buscarUsuariosServicio(dato).subscribe(
   //   (response:any)=> localStorage.setItem("usu",JSON.stringify(response[0]))
      (response:any)=> this.usuario=response[0]

      
    )
  
   
   console.log(this.usuario)
   
  }

  buscarUsuariosServicio(id:any):Observable<any>{
    return this.http.get<any>('http://localhost:3031/profesor/buscar/porId/'+id).pipe(
      catchError(e=> "error")
    )
  }

  alumnos(alum:any){
    
    
    console.log(alum.asignacionList);
    

    localStorage.setItem("alumnosCurso",JSON.stringify(alum.asignacionList))
    location.href="/alumnosAsignados";
  }

}
