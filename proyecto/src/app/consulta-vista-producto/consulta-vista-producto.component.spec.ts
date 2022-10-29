import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ConsultaVistaProductoComponent } from './consulta-vista-producto.component';

describe('ConsultaVistaProductoComponent', () => {
  let component: ConsultaVistaProductoComponent;
  let fixture: ComponentFixture<ConsultaVistaProductoComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ConsultaVistaProductoComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ConsultaVistaProductoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
