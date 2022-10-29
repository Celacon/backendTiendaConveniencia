import { ComponentFixture, TestBed } from '@angular/core/testing';

import { BievenidaProfesorComponent } from './bievenida-profesor.component';

describe('BievenidaProfesorComponent', () => {
  let component: BievenidaProfesorComponent;
  let fixture: ComponentFixture<BievenidaProfesorComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ BievenidaProfesorComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(BievenidaProfesorComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
