import { Component, OnInit } from '@angular/core';
import { AppModule } from '../app.module';
import { Router, ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  constructor(private router: Router,private route: ActivatedRoute) { }
  
  ngOnInit() {
  }
  onLoadServer()
  {
    
    this.router.navigate(['/servers','5','edit','{allowEdit:1}','loading'],{relativeTo: this.route});
  }

}
