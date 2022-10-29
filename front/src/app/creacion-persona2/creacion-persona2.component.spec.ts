import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CreacionPersona2Component } from './creacion-persona2.component';

describe('CreacionPersona2Component', () => {
  let component: CreacionPersona2Component;
  let fixture: ComponentFixture<CreacionPersona2Component>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CreacionPersona2Component ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(CreacionPersona2Component);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
