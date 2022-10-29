import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CreacionTurnoTiendaComponent } from './creacion-turno-tienda.component';

describe('CreacionTurnoTiendaComponent', () => {
  let component: CreacionTurnoTiendaComponent;
  let fixture: ComponentFixture<CreacionTurnoTiendaComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CreacionTurnoTiendaComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(CreacionTurnoTiendaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
