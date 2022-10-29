import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ConsultaclienteComponent } from './consultacliente.component';

describe('ConsultaclienteComponent', () => {
  let component: ConsultaclienteComponent;
  let fixture: ComponentFixture<ConsultaclienteComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ConsultaclienteComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ConsultaclienteComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
