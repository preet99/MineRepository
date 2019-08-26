import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-cokpit',
  templateUrl: './cokpit.component.html',
  styleUrls: ['./cokpit.component.css']
})
export class CokpitComponent implements OnInit {
  serverElements  = [] ;
  constructor() { }

  ngOnInit() {
  }
  onAddServer()
  {
    this.serverElements.push({
    type : 'server',
    name:'ManneServer',
    content :'kuch v likho kyaa fark paddta hai'

    }
    )
  }
  onAddBluePrint()
  {
    this.serverElements.push({
    type : 'bluePrint',
    name:'ManneServer',
    content :'kuch v likho kyaa fark paddta hai'

    }
    )
  }


}
