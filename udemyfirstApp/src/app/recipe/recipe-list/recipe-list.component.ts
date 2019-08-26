import { Component, OnInit } from '@angular/core';
import { Recipe } from '../recipe.model';


@Component({
  selector: 'app-recipe-list',
  templateUrl: './recipe-list.component.html',
  styleUrls: ['./recipe-list.component.css']
})
export class RecipeListComponent implements OnInit {
  recipes: Recipe[] = [new Recipe('Manne', 'stupid', 'https://image.shutterstock.com/image-photo/set-various-spices-herbs-on-450w-1330406447.jpg')];
  constructor() { }

  ngOnInit() {
  }

}

