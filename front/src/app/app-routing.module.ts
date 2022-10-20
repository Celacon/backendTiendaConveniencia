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
{path:'asignarNota',component:AsignarNotaComponent}





];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
