import { Component, OnInit } from '@angular/core';
import {HttpClient, HttpHeaders} from '@angular/common/http';
import {catchError} from 'rxjs/operators' 
import { Observable } from 'rxjs';
import { ToastrService } from 'ngx-toastr';

@Component({
  selector: 'app-consulta-subcategoria',
  templateUrl: './consulta-subcategoria.component.html',
  styleUrls: ['./consulta-subcategoria.component.css']
})
export class ConsultaSubcategoriaComponent implements OnInit {
  subcategorias:any=[];
  paginaActual:number=1;
  constructor(private http:HttpClient,private toastr: ToastrService) { }

  
  ngOnInit(): void {
    this.buscarSubCategorias();
  }
  buscarSubCategorias(){

    this.buscarSubCategoriaServicio().subscribe(
      (response:any)=> this.subcategorias=response
    )
   
  }

  buscarSubCategoriaServicio():Observable<any>{
    return this.http.get<any>('http://localhost:6500/subcategoria/buscar').pipe(
      catchError(e=> "error")
    )
  }
  
  
editar(datos:any){
  localStorage.setItem("editar",JSON.stringify(datos))
  location.href="/editarSubCategoria";
}

  eliminar(datos:any){

   this.eliminarSubCategoriaServicio(datos.idSubcategoria).subscribe(
      (response:any)=> this.confirmarEliminacion()
    )
  }
  
  confirmarEliminacion(){
    this.toastr.success('La subcategoria fue eliminada Correctamente', 'Sub categoria Eliminada',
    {positionClass:'toast-bottom-right'});
    this.buscarSubCategorias()
  }

  eliminarSubCategoriaServicio(id:any){
      return this.http.delete<any>('http://localhost:6500/subcategoria/eliminar/'+id).pipe(
        catchError(e=> "error")
      )
    }

    agregarBoton(){
      location.href="/creacionSubCategoria";
      localStorage.removeItem("editar")
     
    }

}

