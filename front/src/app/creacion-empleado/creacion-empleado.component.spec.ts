import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CreacionEmpleadoComponent } from './creacion-empleado.component';

describe('CreacionEmpleadoComponent', () => {
  let component: CreacionEmpleadoComponent;
  let fixture: ComponentFixture<CreacionEmpleadoComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CreacionEmpleadoComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(CreacionEmpleadoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
