import { Component, OnInit } from '@angular/core';
import { Recipe } from './recipe.model';



@Component({
  selector: 'app-recipe',
  templateUrl: './recipe.component.html',
  styleUrls: ['./recipe.component.css']
})
export class RecipeComponent implements OnInit {
  selected: Recipe;
  recipeSelectedFunction(recipe: Recipe)
  {
     this.selected = recipe;
     console.log(recipe)
  }
  constructor() { }

  ngOnInit() {
  }

}
