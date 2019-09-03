import { Ingredient } from '../shared/ingredient.model';

export class ShoppingService{
    addList(name: string,amount: number)
    {
      new Ingredient(name,amount);
    }
}