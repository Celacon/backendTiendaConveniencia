import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AsignarUsuarioTurnoComponent } from './asignar-usuario-turno.component';

describe('AsignarUsuarioTurnoComponent', () => {
  let component: AsignarUsuarioTurnoComponent;
  let fixture: ComponentFixture<AsignarUsuarioTurnoComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AsignarUsuarioTurnoComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(AsignarUsuarioTurnoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
