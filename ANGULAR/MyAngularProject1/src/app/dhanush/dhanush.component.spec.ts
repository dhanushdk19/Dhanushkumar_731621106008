import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DhanushComponent } from './dhanush.component';

describe('DhanushComponent', () => {
  let component: DhanushComponent;
  let fixture: ComponentFixture<DhanushComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [DhanushComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(DhanushComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
