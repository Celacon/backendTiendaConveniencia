import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ConsultaAlumnoComponent } from './consulta-alumno.component';

describe('ConsultaAlumnoComponent', () => {
  let component: ConsultaAlumnoComponent;
  let fixture: ComponentFixture<ConsultaAlumnoComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ConsultaAlumnoComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ConsultaAlumnoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
