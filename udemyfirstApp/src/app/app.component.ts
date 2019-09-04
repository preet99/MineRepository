import { Component } from '@angular/core';
import { RecipeService } from './recipe/recipe.service';
import { ShoppingService } from './shopping-list/shopping.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  providers: [RecipeService,ShoppingService]
})
export class AppComponent {
  selected: string;
  title = 'udemyfirstApp';
  selectedFeature(type: string)
  {
    this.selected = type;
  }

}
