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
import { CrearPersonaComponent } from './crear-persona/crear-persona.component';
import { ConsultaPersonaComponent } from './consulta-persona/consulta-persona.component';
import { ConsultaEmpleadoComponent } from './consulta-empleado/consulta-empleado.component';
import { CreacionEmpleadoComponent } from './creacion-empleado/creacion-empleado.component';
import { CreacionPersona2Component } from './creacion-persona2/creacion-persona2.component';
import { ConsultarTipodocumentoComponent } from './consultar-tipodocumento/consultar-tipodocumento.component';
import { CreacionTipoDocumentoComponent } from './creacion-tipo-documento/creacion-tipo-documento.component';
import { CreacionRolComponent } from './creacion-rol/creacion-rol.component';
import { ConsultaRolComponent } from './consulta-rol/consulta-rol.component';
import { ConsultaTurnoComponent } from './consulta-turno/consulta-turno.component';
import { CreacionTurnoComponent } from './creacion-turno/creacion-turno.component';
import { CreacionTurnoTiendaComponent } from './creacion-turno-tienda/creacion-turno-tienda.component';
import { ConsultaTurnoTiendaComponent } from './consulta-turno-tienda/consulta-turno-tienda.component';
import { AsignarUsuarioTurnoComponent } from './asignar-usuario-turno/asignar-usuario-turno.component';
import { ConsultaEmpleadosAsignadosComponent } from './consulta-empleados-asignados/consulta-empleados-asignados.component';
import { CreacionEmpleado2Component } from './creacion-empleado2/creacion-empleado2.component';




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
    CrearPersonaComponent,
    ConsultaPersonaComponent,
    ConsultaEmpleadoComponent,
    CreacionEmpleadoComponent,
    CreacionPersona2Component,
    ConsultarTipodocumentoComponent,
    CreacionTipoDocumentoComponent,
    CreacionRolComponent,
    ConsultaRolComponent,
    ConsultaTurnoComponent,
    CreacionTurnoComponent,
    CreacionTurnoTiendaComponent,
    ConsultaTurnoTiendaComponent,
    AsignarUsuarioTurnoComponent,
    ConsultaEmpleadosAsignadosComponent,
    CreacionEmpleado2Component,
 
 
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
