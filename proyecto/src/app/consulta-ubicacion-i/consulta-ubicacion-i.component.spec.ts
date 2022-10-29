import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ConsultaUbicacionIComponent } from './consulta-ubicacion-i.component';

describe('ConsultaUbicacionIComponent', () => {
  let component: ConsultaUbicacionIComponent;
  let fixture: ComponentFixture<ConsultaUbicacionIComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ConsultaUbicacionIComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ConsultaUbicacionIComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
