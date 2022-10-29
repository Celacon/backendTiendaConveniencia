import { Component, OnInit } from '@angular/core';
import {HttpClient, HttpHeaders} from '@angular/common/http';
import {catchError} from 'rxjs/operators' 
import { Observable } from 'rxjs';
import { ToastrService } from 'ngx-toastr';

@Component({
  selector: 'app-consulta-producto',
  templateUrl: './consulta-producto.component.html',
  styleUrls: ['./consulta-producto.component.css']
})
export class ConsultaProductoComponent implements OnInit {


  productos:any=[];
  paginaActual:number=1;
  constructor(private http:HttpClient,private toastr: ToastrService) { }

  ngOnInit(): void {
    this.buscarProductos();
  }
  buscarProductos(){

    this.buscarProductoServicio().subscribe(
      (response:any)=> this.productos=response
    )
   
  }

  buscarProductoServicio():Observable<any>{
    return this.http.get<any>('http://localhost:6500/producto/buscar').pipe(
      catchError(e=> "error")
    )
  }
  
  
editar(datos:any){
  localStorage.setItem("editar",JSON.stringify(datos))
  location.href="/editarProducto";
}

  eliminar(datos:any){

   this.eliminarProductoServicio(datos.idProducto).subscribe(
      (response:any)=> this.confirmarEliminacion()
    )
  }
  
  confirmarEliminacion(){
    this.toastr.success('El Producto fue eliminado Correctamente', 'Producto Eliminado',
    {positionClass:'toast-bottom-right'});
    this.buscarProductos()
  }

    eliminarProductoServicio(id:any){
      return this.http.delete<any>('http://localhost:6500/producto/eliminar/'+id).pipe(
        catchError(e=> "error")
      )
    }

    agregarBoton(){
      location.href="/creacionProducto";
      localStorage.removeItem("editar")
     
    }

}
