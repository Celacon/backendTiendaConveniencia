import { Component, OnInit } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {catchError} from 'rxjs/operators' 
import { HttpHeaders } from '@angular/common/http';


@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

usuario:any ={};


usuarioInvalido:boolean= false;

constructor(private http: HttpClient) { }

  ngOnInit(): void {
  
  }
    formularioLogin(){
      let formularioValido:any = document. getElementById("login-form");
      if(formularioValido.reportValidity()){
        this.servicioLoginAdmin().subscribe(
          (respuesta: any)=> this.loginAdmin(respuesta)
  
        )
      }
  
    }




  
    loginAdmin(res: any){
      if (res.length==0){
        
       // this.servicioLogin().subscribe(
      //    (respuesta: any)=> this.login(respuesta)
  
        //)      
      }else{
        localStorage.setItem("usu",JSON.stringify(res[0]))
        location.href="/bienvenidaAdmin";
      }
  
    }

    login(res: any){
      if (res.length==0){
        this.usuarioInvalido=true;
      }else{
        localStorage.setItem("usu",JSON.stringify(res[0]))
        location.href="/bienvenidaProfesor";
      }
    
    }


///admin
    
    servicioLoginAdmin(){
      var httpOptions ={
        headers: new HttpHeaders({
          'Content-Type':'application/json'
        })
      } 
      return this.http.post<any>('http://localhost:6500/signin/login',this.usuario,httpOptions).pipe(
        catchError(e=> "error")
      )
      }

//profesor   
   /*   servicioLogin(){
        var httpOptions ={
          headers: new HttpHeaders({
            'Content-Type':'application/json'
          })
        } 
        return this.http.post<any>('http://localhost:3031/profesor/login',this.usuario,httpOptions).pipe(
          catchError(e=> "error")
        )
        }*/
}
