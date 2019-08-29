import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',

})
export class AppComponent {
  selected: string;
  title = 'udemyfirstApp';
  selectedFeature(type: string)
  {
    this.selected = type;
  }

}
