import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ConsultaTurnoTiendaComponent } from './consulta-turno-tienda.component';

describe('ConsultaTurnoTiendaComponent', () => {
  let component: ConsultaTurnoTiendaComponent;
  let fixture: ComponentFixture<ConsultaTurnoTiendaComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ConsultaTurnoTiendaComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ConsultaTurnoTiendaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
