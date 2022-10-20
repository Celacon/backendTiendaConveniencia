import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ConsultaProfesorComponent } from './consulta-profesor.component';

describe('ConsultaProfesorComponent', () => {
  let component: ConsultaProfesorComponent;
  let fixture: ComponentFixture<ConsultaProfesorComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ConsultaProfesorComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ConsultaProfesorComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
