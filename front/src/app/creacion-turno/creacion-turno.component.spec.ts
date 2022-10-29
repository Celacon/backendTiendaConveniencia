import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CreacionTurnoComponent } from './creacion-turno.component';

describe('CreacionTurnoComponent', () => {
  let component: CreacionTurnoComponent;
  let fixture: ComponentFixture<CreacionTurnoComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CreacionTurnoComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(CreacionTurnoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
