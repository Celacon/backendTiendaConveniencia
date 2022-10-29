import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ConsultaPresentacionComponent } from './consulta-presentacion.component';

describe('ConsultaPresentacionComponent', () => {
  let component: ConsultaPresentacionComponent;
  let fixture: ComponentFixture<ConsultaPresentacionComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ConsultaPresentacionComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ConsultaPresentacionComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
