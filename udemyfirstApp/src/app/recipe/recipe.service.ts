import { Recipe } from './recipe.model';

export class RecipeService{
    recipes: Recipe[] = [new Recipe('Manne', 'stupid', 'https://image.shutterstock.com/image-photo/set-various-spices-herbs-on-450w-1330406447.jpg')];
    selected: Recipe;
    onRecipeClick(recipeSelected: Recipe)
    { console.log("recipeListComponent"+ recipeSelected)
        this.selected = recipeSelected;
    }
}