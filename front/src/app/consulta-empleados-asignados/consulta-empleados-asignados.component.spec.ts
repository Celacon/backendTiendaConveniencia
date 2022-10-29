import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ConsultaEmpleadosAsignadosComponent } from './consulta-empleados-asignados.component';

describe('ConsultaEmpleadosAsignadosComponent', () => {
  let component: ConsultaEmpleadosAsignadosComponent;
  let fixture: ComponentFixture<ConsultaEmpleadosAsignadosComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ConsultaEmpleadosAsignadosComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ConsultaEmpleadosAsignadosComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
