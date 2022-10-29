import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CreacionTipoDocumentoComponent } from './creacion-tipo-documento.component';

describe('CreacionTipoDocumentoComponent', () => {
  let component: CreacionTipoDocumentoComponent;
  let fixture: ComponentFixture<CreacionTipoDocumentoComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CreacionTipoDocumentoComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(CreacionTipoDocumentoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
