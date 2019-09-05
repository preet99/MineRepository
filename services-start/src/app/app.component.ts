import { Component, OnInit } from '@angular/core';
import { LoggingService } from './logging.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css'],
  providers: [LoggingService]
})
export class AppComponent implements OnInit{
 accounts: {name: string, status: string}[];
 constructor(private logging: LoggingService)
 {
  console.log("account app module constructor" + this.accounts)
 }
 ngOnInit()
 {
   this.accounts = this.logging.accounts;
   console.log("account app moduleeeeeeeeeee" + this.accounts)
 }
 
}
