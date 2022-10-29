import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ConsultaTurnoComponent } from './consulta-turno.component';

describe('ConsultaTurnoComponent', () => {
  let component: ConsultaTurnoComponent;
  let fixture: ComponentFixture<ConsultaTurnoComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ConsultaTurnoComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ConsultaTurnoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
