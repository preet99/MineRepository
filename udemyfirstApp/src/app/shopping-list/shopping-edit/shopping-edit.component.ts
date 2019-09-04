import { Component, OnInit, Output,EventEmitter, ViewChild, ElementRef } from '@angular/core';
import { Ingredient } from 'src/app/shared/ingredient.model';
import { ShoppingService } from '../shopping.service';


@Component({
  selector: 'app-shopping-edit',
  templateUrl: './shopping-edit.component.html',
  styleUrls: ['./shopping-edit.component.css']
})
export class ShoppingEditComponent implements OnInit {

   dummy: {name: string,amount: number};
  @ViewChild('name') name: ElementRef;
  @ViewChild('amount') amount: ElementRef;

  addList()
  {
    this.shoppingService.addList(this.name.nativeElement.value,this.amount.nativeElement.value);
  }
  constructor(private shoppingService: ShoppingService) { }

  ngOnInit() {
  }

}
