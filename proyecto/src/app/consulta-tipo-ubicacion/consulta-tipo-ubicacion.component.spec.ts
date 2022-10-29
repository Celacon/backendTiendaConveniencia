import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ConsultaTipoUbicacionComponent } from './consulta-tipo-ubicacion.component';

describe('ConsultaTipoUbicacionComponent', () => {
  let component: ConsultaTipoUbicacionComponent;
  let fixture: ComponentFixture<ConsultaTipoUbicacionComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ConsultaTipoUbicacionComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ConsultaTipoUbicacionComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
