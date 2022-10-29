import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ConsultapagosComponent } from './consultapagos.component';

describe('ConsultapagosComponent', () => {
  let component: ConsultapagosComponent;
  let fixture: ComponentFixture<ConsultapagosComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ConsultapagosComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ConsultapagosComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
