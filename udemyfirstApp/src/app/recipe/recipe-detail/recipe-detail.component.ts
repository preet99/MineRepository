import { Component, OnInit,Input } from '@angular/core';
import { Recipe } from '../recipe.model';
import { ShoppingService } from 'src/app/shopping-list/shopping.service';
import { AngularWaitBarrier } from 'blocking-proxy/built/lib/angular_wait_barrier';
import { Ingredient } from 'src/app/shared/ingredient.model';

@Component({
  selector: 'app-recipe-detail',
  templateUrl: './recipe-detail.component.html',
  styleUrls: ['./recipe-detail.component.css']
})
export class RecipeDetailComponent implements OnInit {
 @Input() recipeInfo: Recipe;
  constructor(private shoppingService: ShoppingService) { }

  ngOnInit() {
  }
  toShoppingList()
  {
    console.log(' this.recipeInfo.ingredients'+  this.recipeInfo.ingredients)
    this.recipeInfo.ingredients.forEach(it =>
      {
        //console.log(it.name)
        this.shoppingService.addList(it.name,it.amount);
      }
    );
     
      
    }
 
  }
  


