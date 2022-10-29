import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ConsultarTipodocumentoComponent } from './consultar-tipodocumento.component';

describe('ConsultarTipodocumentoComponent', () => {
  let component: ConsultarTipodocumentoComponent;
  let fixture: ComponentFixture<ConsultarTipodocumentoComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ConsultarTipodocumentoComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ConsultarTipodocumentoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
