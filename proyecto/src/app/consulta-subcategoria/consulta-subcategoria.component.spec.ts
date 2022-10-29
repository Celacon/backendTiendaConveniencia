import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ConsultaSubcategoriaComponent } from './consulta-subcategoria.component';

describe('ConsultaSubcategoriaComponent', () => {
  let component: ConsultaSubcategoriaComponent;
  let fixture: ComponentFixture<ConsultaSubcategoriaComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ConsultaSubcategoriaComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ConsultaSubcategoriaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
