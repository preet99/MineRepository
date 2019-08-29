import { Component, OnInit } from '@angular/core';
import {Ingredient} from '../shared/ingredient.model'


@Component({
  selector: 'app-shopping-list',
  templateUrl: './shopping-list.component.html',
  styleUrls: ['./shopping-list.component.css']
})
export class ShoppingListComponent implements OnInit {
  ingredient: Ingredient[] = [
    new Ingredient('Tomato',10),
    new Ingredient('Apple',5)
  ];
  addingIngredient(ingred: Ingredient)
  { console.log(ingred)
   this.ingredient.push(ingred); 
   }
   constructor() { }


  ngOnInit() {
  }

}
