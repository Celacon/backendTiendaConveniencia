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


// EMPIEZO A AGREGAR MIS COMPONENTES.
import { ConsultaUbicacionComponent } from './consulta-ubicacion/consulta-ubicacion.component';
import { ConsultaUbicacionIComponent } from './consulta-ubicacion-i/consulta-ubicacion-i.component';
import { ConsultaProductoComponent } from './consulta-producto/consulta-producto.component';
import { ConsultaPresentacionComponent } from './consulta-presentacion/consulta-presentacion.component';
import { ConsultaSubcategoriaComponent } from './consulta-subcategoria/consulta-subcategoria.component';
import { ConsultaTipoUbicacionComponent } from './consulta-tipo-ubicacion/consulta-tipo-ubicacion.component';
import { ConsultaVistaProductoComponent } from './consulta-vista-producto/consulta-vista-producto.component';
import { CreacionProductoComponent } from './creacion-producto/creacion-producto.component';

const routes: Routes = [
  
{path:'', component:HomeComponent},
{path:'bienvenidaProfesor', component:BievenidaProfesorComponent},
{path:'bienvenidaAdmin', component:BienvenidaAdminComponent},
{path:'creacionAlumno', component:CreacionAlumnoComponent},
{path:'creacionCurso', component:CreacionCursoComponent},
{path:'consultaAlumno', component:ConsultaAlumnoComponent},
{path:'consultaProfesor', component:ConsultaProfesorComponent},
{path:'consultaCurso', component:ConsultaCursoComponent},
{path:'consultaAsignacion',component:ConsultaAsignacionComponent},
{path:'alumnosAsignados',component:AlumnosAsignadosComponent},
{path:'asignarNota',component:AsignarNotaComponent},
{path:'creacionProfesor', component:CreacionProfesorComponent},
{path: 'creacionAsignacion',component:CreacionAsignacionComponent},
{path:'editarProfesor', component:CreacionProfesorComponent},
{path:'editarAlumno', component:CreacionAlumnoComponent},
{path:'editarCurso', component:CreacionCursoComponent},
{path: 'editarAsignacion',component:CreacionAsignacionComponent},
{path: 'cursosAsignados',component:CursosAsignadosComponent},



{path: 'consultaUbicacion', component:ConsultaUbicacionComponent},
{path: 'consultaUbicacionI', component:ConsultaUbicacionIComponent},
{path: 'consultaProducto', component:ConsultaProductoComponent},
{path: 'consultaPresentacion', component:ConsultaPresentacionComponent},
{path: 'consultaSubCategoria', component:ConsultaSubcategoriaComponent},
{path: 'consultaTipoUbicacion', component:ConsultaTipoUbicacionComponent},
{path: 'consultaVistaProducto', component:ConsultaVistaProductoComponent},
{ path: 'creacionProducto', component:CreacionProductoComponent}



];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
