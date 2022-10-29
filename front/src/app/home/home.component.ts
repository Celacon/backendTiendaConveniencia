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

 public usuario:any = {};
 public session:boolean = false;
 public mensaje:string = "";
 public role:String = "";
 public userOnline:any = [] ;



public usuarioInvalido:boolean= false;

constructor(private http: HttpClient) { }

  ngOnInit(): void {

    if (!this.session){
      sessionStorage.clear();
    }
  
  }



    formularioLogin(){
      let formularioValido:any = document.getElementById("login-form");
      
      if(formularioValido.reportValidity()){
        this.servicioLogin().subscribe(
          (respuesta: any)=>  this.loginAdmin(respuesta)
        )
        
      }
  
    }



    loginAdmin(res: any){
     console.log("res -->" + res);
      let json = JSON.parse(res);
      let formularioLogin:any = document.getElementById("login-form");
      console.log(json);
      if(json.ususario != "none"){
     

        localStorage.setItem("usu",JSON.stringify(json))        
        //this.session = true;
        this.mensaje = "Bienvenido " + json.usuario;
        this.role = json.rol;

        //sessionStorage.setItem("usuario",json);
      //  sessionStorage.setItem("nombreUsuario", json.usuario);
       // sessionStorage.setItem("rol", json.nombreUsuario);
        //sessionStorage.setItem("idusuario", json.rol);
        location.href="/bienvenidaAdmin";
  
      } else {
        this.session = true;

          this.mensaje = "*Intente de nuevo o contáctese con el administrador del sistema";
          alert("Usuario o Contraseña Inválido");
          formularioLogin.reset();
      }
  
    }

///admin
    
    servicioLogin(){
      let httpOptions ={
        Headers: new HttpHeaders({
          'Accept':'txt/html'
        }),responseType:'text' as 'json'
        
      } 
      return this.http.post<any>('http://localhost:6500/signin/login',this.usuario,httpOptions).pipe(
        catchError(e=> "error"))
      }


}
