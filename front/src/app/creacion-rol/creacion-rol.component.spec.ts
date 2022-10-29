import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CreacionRolComponent } from './creacion-rol.component';

describe('CreacionRolComponent', () => {
  let component: CreacionRolComponent;
  let fixture: ComponentFixture<CreacionRolComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CreacionRolComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(CreacionRolComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
