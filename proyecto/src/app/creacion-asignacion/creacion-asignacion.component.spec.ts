import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CreacionAsignacionComponent } from './creacion-asignacion.component';

describe('CreacionAsignacionComponent', () => {
  let component: CreacionAsignacionComponent;
  let fixture: ComponentFixture<CreacionAsignacionComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CreacionAsignacionComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(CreacionAsignacionComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
