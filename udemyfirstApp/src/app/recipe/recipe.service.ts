import { Recipe } from './recipe.model';
import { Ingredient } from '../shared/ingredient.model';
import { injectRenderer2 } from '@angular/core/src/render3/view_engine_compatibility';

export class RecipeService{
    ingredient = [new Ingredient('Tomato',324) , new Ingredient('Gauava',23), new Ingredient('Potato',23)];
    recipes: Recipe[] = [new Recipe('Manne', 'stupid', 'https://image.shutterstock.com/image-photo/set-various-spices-herbs-on-450w-1330406447.jpg',this.ingredient)];
    selected: Recipe;
    onRecipeClick(recipeSelected: Recipe)
    { console.log("recipeListComponent"+ recipeSelected)
        this.selected = recipeSelected;
    }
}