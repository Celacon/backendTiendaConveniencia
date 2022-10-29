import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ConsultaserieComponent } from './consultaserie.component';

describe('ConsultaserieComponent', () => {
  let component: ConsultaserieComponent;
  let fixture: ComponentFixture<ConsultaserieComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ConsultaserieComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ConsultaserieComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
