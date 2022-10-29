import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ConsultaAsignacionComponent } from './consulta-asignacion.component';

describe('ConsultaAsignacionComponent', () => {
  let component: ConsultaAsignacionComponent;
  let fixture: ComponentFixture<ConsultaAsignacionComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ConsultaAsignacionComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ConsultaAsignacionComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
