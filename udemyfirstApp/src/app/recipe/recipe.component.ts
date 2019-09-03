import { Component, OnInit } from '@angular/core';
import { Recipe } from './recipe.model';
import { RecipeService } from './recipe.service';



@Component({
  selector: 'app-recipe',
  templateUrl: './recipe.component.html',
  styleUrls: ['./recipe.component.css']
})
export class RecipeComponent implements OnInit {
  selected: Recipe;
  
  constructor(private recipeService: RecipeService) {
   
  }

  checkSelected()
  {
    this.selected = this.recipeService.selected;
    return this.selected
  }
  ngOnInit() {
    this.selected = this.recipeService.selected;
  }

}
