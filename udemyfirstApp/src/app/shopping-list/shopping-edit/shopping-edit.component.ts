import { Component, OnInit, Output,EventEmitter, ViewChild, ElementRef } from '@angular/core';
import { Ingredient } from 'src/app/shared/ingredient.model';


@Component({
  selector: 'app-shopping-edit',
  templateUrl: './shopping-edit.component.html',
  styleUrls: ['./shopping-edit.component.css']
})
export class ShoppingEditComponent implements OnInit {

  @Output() ingredients = new EventEmitter<Ingredient>();
  @ViewChild('name') name: ElementRef;
  @ViewChild('amount') amount: ElementRef;

  addList()
  {
    this.ingredients.emit(new Ingredient(this.name.nativeElement.value,this.amount.nativeElement.value))
  }
  constructor() { }

  ngOnInit() {
  }

}
