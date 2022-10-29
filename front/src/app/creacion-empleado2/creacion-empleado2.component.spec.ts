import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CreacionEmpleado2Component } from './creacion-empleado2.component';

describe('CreacionEmpleado2Component', () => {
  let component: CreacionEmpleado2Component;
  let fixture: ComponentFixture<CreacionEmpleado2Component>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CreacionEmpleado2Component ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(CreacionEmpleado2Component);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
