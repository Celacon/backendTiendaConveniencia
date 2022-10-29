import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AlumnosAsignadosComponent } from './alumnos-asignados.component';

describe('AlumnosAsignadosComponent', () => {
  let component: AlumnosAsignadosComponent;
  let fixture: ComponentFixture<AlumnosAsignadosComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AlumnosAsignadosComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(AlumnosAsignadosComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
