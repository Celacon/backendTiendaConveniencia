import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { BievenidaProfesorComponent } from './bievenida-profesor/bievenida-profesor.component';
import { BienvenidaAdminComponent } from './bienvenida-admin/bienvenida-admin.component';

import { CreacionPersona2Component } from './creacion-persona2/creacion-persona2.component';
import {ConsultaPersonaComponent} from './consulta-persona/consulta-persona.component';
import { ConsultaEmpleadoComponent } from './consulta-empleado/consulta-empleado.component';
import { CreacionEmpleadoComponent } from './creacion-empleado/creacion-empleado.component';
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
const routes: Routes = [
  
{path:'', component:HomeComponent},
{path:'bienvenidaProfesor', component:BievenidaProfesorComponent},
{path:'bienvenidaAdmin', component:BienvenidaAdminComponent},

{path:'creacionPersona',component:CreacionPersona2Component},
{path:'editarPersona',component:CreacionPersona2Component},
{path:'consultaPersona', component:ConsultaPersonaComponent},
{path:'consultaEmpleado', component:ConsultaEmpleadoComponent},
{path:'creacionEmpleado', component:CreacionEmpleado2Component},
{path:'editarEmpleado',component:CreacionEmpleadoComponent},
{path:'consultaTipoDocumento',component:ConsultarTipodocumentoComponent},
{path:'creacionTipoDocumento',component:CreacionTipoDocumentoComponent},
{path:'editarTipoDocumento',component:CreacionTipoDocumentoComponent},
{path:'consultaRol', component:ConsultaRolComponent},
{path:'editarRol',component:CreacionRolComponent},
{path:'creacionRol',component:CreacionRolComponent},
{path:'consultaTurno',component:ConsultaTurnoComponent},
{path:'creacionTurno',component:CreacionTurnoComponent},
{path:'editarTurno',component:CreacionTurnoComponent},
{path:'consutaTurnoTienda',component:ConsultaTurnoTiendaComponent},
{path:'creacionTurnoTienda',component:CreacionTurnoTiendaComponent},
{path:'editarTurnoTienda',component:CreacionTurnoTiendaComponent},
{path:'asignacionUsuarioTurno',component:AsignarUsuarioTurnoComponent},
{path:'empleadosAsignados', component:ConsultaEmpleadosAsignadosComponent}



];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
