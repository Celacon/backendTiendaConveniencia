import { Component, OnInit } from '@angular/core';
import {HttpClient, HttpHeaders} from '@angular/common/http';
import {catchError} from 'rxjs/operators' 
import { Observable } from 'rxjs';
import { ToastrService } from 'ngx-toastr';

@Component({
  selector: 'app-consulta-ubicacion',
  templateUrl: './consulta-ubicacion.component.html',
  styleUrls: ['./consulta-ubicacion.component.css']
})
export class ConsultaUbicacionComponent implements OnInit {

  ubicaciones:any=[];
  paginaActual:number=1;

  constructor(private http:HttpClient,private toastr: ToastrService) { }

  ngOnInit(): void {
    this.buscarUbicacion();
  }

  buscarUbicacion(){

    this.buscarUbicacionServicio().subscribe(
      (response:any)=> this.ubicaciones=response
    )
  }

  buscarUbicacionServicio():Observable<any>{
    return this.http.get<any>('http://localhost:6500/Viubicacion/buscar').pipe(
      catchError(e=> "error")
    )
  }

}
