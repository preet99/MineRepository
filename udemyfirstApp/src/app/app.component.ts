import { Component } from '@angular/core';
import { RecipeService } from './recipe/recipe.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  providers: [RecipeService]

})
export class AppComponent {
  selected: string;
  title = 'udemyfirstApp';
  selectedFeature(type: string)
  {
    this.selected = type;
  }

}
