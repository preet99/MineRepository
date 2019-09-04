import { Ingredient } from '../shared/ingredient.model';
import { EventEmitter, Output } from '@angular/core';

export class ShoppingService{
    @Output() ingredientchanged = new EventEmitter<Ingredient[]>();
    addList(name: string,amount: number)
    {  
     var dumy  = new Ingredient(name,amount);
     console.log(this.ingredient)
     console.log('this.ingredient.indexOf(dumy) '+ (this.ingredient.indexOf(dumy)!== -1))
     console.log('this.ingredient.indexOf(dumy) '+ (this.ingredient.indexOf(dumy)))
     console.log(dumy)
     if(this.ingredient.indexOf(dumy)!== 0)
     {
       this.ingredient.push(dumy); 
       this.ingredientchanged.emit(this.ingredient.slice());
     }
    }
    getIngredient()
    {
      return this.ingredient.slice();
    }
    ingredient: Ingredient[] = [
      new Ingredient('Tomato',10),
      new Ingredient('Apple',5)
    ];
}