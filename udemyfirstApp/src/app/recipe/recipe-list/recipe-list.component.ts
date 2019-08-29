import { Component, OnInit, Output,EventEmitter } from '@angular/core';
import { Recipe } from '../recipe.model';



@Component({
  selector: 'app-recipe-list',
  templateUrl: './recipe-list.component.html',
  styleUrls: ['./recipe-list.component.css']
})
export class RecipeListComponent implements OnInit {
  recipes: Recipe[] = [new Recipe('Manne', 'stupid', 'https://image.shutterstock.com/image-photo/set-various-spices-herbs-on-450w-1330406447.jpg')];
  @Output() selectedRecipe = new EventEmitter<Recipe>();
  onRecipeClick(recipeSelected: Recipe)
  {
    this.selectedRecipe.emit(recipeSelected) 
  }
  constructor() { }

  ngOnInit() {
  }

}

