import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AsignarNotaComponent } from './asignar-nota.component';

describe('AsignarNotaComponent', () => {
  let component: AsignarNotaComponent;
  let fixture: ComponentFixture<AsignarNotaComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AsignarNotaComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(AsignarNotaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
