import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CreacionProfesorComponent } from './creacion-profesor.component';

describe('CreacionProfesorComponent', () => {
  let component: CreacionProfesorComponent;
  let fixture: ComponentFixture<CreacionProfesorComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CreacionProfesorComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(CreacionProfesorComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
