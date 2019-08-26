import { Component, OnInit } from '@angular/core';
import { DataserviceService } from '../dataservice.service';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {
  h1Style:Boolean = false;
 
  constructor(private data:DataserviceService) {   }

  ngOnInit() {
  }

  clickme()
  {
   this.data.getmrmbers();
  }

}
