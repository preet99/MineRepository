import { Component, OnInit, OnDestroy } from '@angular/core';

import { ServersService } from '../servers.service';
import { ActivatedRoute, Params, Router } from '@angular/router';
import { Subscription } from 'rxjs';

@Component({
  selector: 'app-server',
  templateUrl: './server.component.html',
  styleUrls: ['./server.component.css']
})
export class ServerComponent implements OnInit,OnDestroy {
  server: {id: number, name: string, status: string};
  private subscription: Subscription;
  constructor(private serversService: ServersService,private activatedRoute: ActivatedRoute,private router: Router) { }

  ngOnInit() {
    
    var required = this.activatedRoute.snapshot.params['id'];
    this.server = this.serversService.getServer(required);
     this.activatedRoute.params.subscribe(
      (params: Params)=>
      {
        this.server = this.serversService.getServer(params.id);
      }
    )
    
  }
  onEdit()
  {
    //var required = this.activatedRoute.snapshot.params['id'];
    this.router.navigate(['edit'],{relativeTo: this.activatedRoute}) 
  }
  ngOnDestroy(){
  // this.subscription.unsubscribe();
  }

}
