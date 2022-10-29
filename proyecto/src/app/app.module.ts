import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeComponent } from './home/home.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { BievenidaProfesorComponent } from './bievenida-profesor/bievenida-profesor.component';
import { BienvenidaAdminComponent } from './bienvenida-admin/bienvenida-admin.component';
import { CreacionProfesorComponent } from './creacion-profesor/creacion-profesor.component';
import { CreacionAlumnoComponent } from './creacion-alumno/creacion-alumno.component';
import { CreacionCursoComponent } from './creacion-curso/creacion-curso.component';
import { ConsultaAlumnoComponent } from './consulta-alumno/consulta-alumno.component';
import { ConsultaProfesorComponent } from './consulta-profesor/consulta-profesor.component';
import { ConsultaCursoComponent } from './consulta-curso/consulta-curso.component';
import {NgxPaginationModule} from 'ngx-pagination';
import { ToastrModule } from 'ngx-toastr'; 
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { ConsultaAsignacionComponent } from './consulta-asignacion/consulta-asignacion.component';
import { CreacionAsignacionComponent } from './creacion-asignacion/creacion-asignacion.component';
import { CursosAsignadosComponent } from './cursos-asignados/cursos-asignados.component';
import { AlumnosAsignadosComponent } from './alumnos-asignados/alumnos-asignados.component';
import { AsignarNotaComponent } from './asignar-nota/asignar-nota.component';
import { ConsultaUbicacionComponent } from './consulta-ubicacion/consulta-ubicacion.component';
import { ConsultaUbicacionIComponent } from './consulta-ubicacion-i/consulta-ubicacion-i.component';
import { ConsultaProductoComponent } from './consulta-producto/consulta-producto.component';
import { ConsultaPresentacionComponent } from './consulta-presentacion/consulta-presentacion.component';
import { ConsultaSubcategoriaComponent } from './consulta-subcategoria/consulta-subcategoria.component';
import { ConsultaTipoUbicacionComponent } from './consulta-tipo-ubicacion/consulta-tipo-ubicacion.component';
import { ConsultaVistaProductoComponent } from './consulta-vista-producto/consulta-vista-producto.component';
import { CreacionProductoComponent } from './creacion-producto/creacion-producto.component';




@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    BievenidaProfesorComponent,
    BienvenidaAdminComponent,
    CreacionProfesorComponent,
    CreacionAlumnoComponent,
    CreacionCursoComponent,
    ConsultaAlumnoComponent,
    ConsultaProfesorComponent,
    ConsultaCursoComponent,
    ConsultaAsignacionComponent,
    CreacionAsignacionComponent,
    CursosAsignadosComponent,
    AlumnosAsignadosComponent,
    AsignarNotaComponent,
    ConsultaUbicacionComponent,
    ConsultaUbicacionIComponent,
    ConsultaProductoComponent,
    ConsultaPresentacionComponent,
    ConsultaSubcategoriaComponent,
    ConsultaTipoUbicacionComponent,
    ConsultaVistaProductoComponent,
    CreacionProductoComponent,
 
 
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule, 
    HttpClientModule,
    NgxPaginationModule,
    ReactiveFormsModule,
    ToastrModule.forRoot(),
    BrowserAnimationsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
