import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CreacionCursoComponent } from './creacion-curso.component';

describe('CreacionCursoComponent', () => {
  let component: CreacionCursoComponent;
  let fixture: ComponentFixture<CreacionCursoComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CreacionCursoComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(CreacionCursoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
