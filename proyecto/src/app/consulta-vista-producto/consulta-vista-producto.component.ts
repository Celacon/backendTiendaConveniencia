import { Component, OnInit } from '@angular/core';
import {HttpClient, HttpHeaders} from '@angular/common/http';
import {catchError} from 'rxjs/operators' 
import { Observable } from 'rxjs';
import { ToastrService } from 'ngx-toastr';

@Component({
  selector: 'app-consulta-vista-producto',
  templateUrl: './consulta-vista-producto.component.html',
  styleUrls: ['./consulta-vista-producto.component.css']
})
export class ConsultaVistaProductoComponent implements OnInit {
  prod:any=[];
  paginaActual:number=1;
  
  constructor(private http:HttpClient,private toastr: ToastrService) { }

  ngOnInit(): void {
    this.buscarViProd();
  }

  buscarViProd(){

    this.buscarViProdServicio().subscribe(
      (response:any)=> this.prod=response
    )
  }

  buscarViProdServicio():Observable<any>{
    return this.http.get<any>('http://localhost:6500/ViProducto/buscar').pipe(
      catchError(e=> "error")
    )
  }

}
