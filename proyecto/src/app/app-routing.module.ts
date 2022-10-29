import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { BievenidaProfesorComponent } from './bievenida-profesor/bievenida-profesor.component';
import { BienvenidaAdminComponent } from './bienvenida-admin/bienvenida-admin.component';
import { CreacionAlumnoComponent } from './creacion-alumno/creacion-alumno.component';
import { CreacionCursoComponent } from './creacion-curso/creacion-curso.component';
import { CreacionProfesorComponent } from './creacion-profesor/creacion-profesor.component';
import { CreacionAsignacionComponent } from './creacion-asignacion/creacion-asignacion.component';
import { ConsultaAlumnoComponent } from './consulta-alumno/consulta-alumno.component';
import { ConsultaProfesorComponent } from './consulta-profesor/consulta-profesor.component';
import { ConsultaCursoComponent } from './consulta-curso/consulta-curso.component';
import { ConsultaAsignacionComponent } from './consulta-asignacion/consulta-asignacion.component';
import { CursosAsignadosComponent } from './cursos-asignados/cursos-asignados.component';
import { AlumnosAsignadosComponent } from './alumnos-asignados/alumnos-asignados.component';
import { AsignarNotaComponent } from './asignar-nota/asignar-nota.component';
import { ClienteComponent } from './cliente/cliente.component';
import { SerieComponent } from './serie/serie.component';
import { TipopagoComponent } from './tipopago/tipopago.component';
import { ConsultaclienteComponent } from './consultacliente/consultacliente.component';
import { ConsultaserieComponent } from './consultaserie/consultaserie.component';
import { ConsultapagosComponent } from './consultapagos/consultapagos.component';


const routes: Routes = [
  
{path:'', component:HomeComponent},
{path:'bienvenidaProfesor', component:BievenidaProfesorComponent},
{path:'bienvenidaAdmin', component:BienvenidaAdminComponent},
{path:'creacionAlumno', component:CreacionAlumnoComponent},
{path:'creacionCurso', component:CreacionCursoComponent},
{path:'creacionProfesor', component:CreacionProfesorComponent},
{path: 'creacionAsignacion',component:CreacionAsignacionComponent},
{path:'consultaAlumno', component:ConsultaAlumnoComponent},
{path:'consultaProfesor', component:ConsultaProfesorComponent},
{path:'consultaCurso', component:ConsultaCursoComponent},
{path:'consultaAsignacion',component:ConsultaAsignacionComponent},
{path:'editarProfesor', component:CreacionProfesorComponent},
{path:'editarAlumno', component:CreacionAlumnoComponent},
{path:'editarCurso', component:CreacionCursoComponent},
{path: 'editarAsignacion',component:CreacionAsignacionComponent},
{path: 'cursosAsignados',component:CursosAsignadosComponent},
{path:'alumnosAsignados',component:AlumnosAsignadosComponent},
{path:'asignarNota',component:AsignarNotaComponent},
{path:'cliente',component:ClienteComponent},
{path:'serie',component:SerieComponent},
{path:'tipopago',component:TipopagoComponent},
{path:'consultacliente',component:ConsultaclienteComponent},
{path:'consultaserie',component:ConsultaserieComponent},
{path:'consultapagos',component:ConsultapagosComponent}








];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
