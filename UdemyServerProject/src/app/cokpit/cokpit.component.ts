import { Component, OnInit, Output, EventEmitter } from '@angular/core';

@Component({
  selector: 'app-cokpit',
  templateUrl: './cokpit.component.html',
  styleUrls: ['./cokpit.component.css']
})
export class CokpitComponent implements OnInit {
  @Output() serverCreated = new EventEmitter<{serverName:string,serverContent: string}>();
  @Output() bluePrintCreated  = new EventEmitter<{serverName:string,serverContent: string}>();
  serverElements  = [] ;
  newServerName: string;
  newServerContent: string;
  constructor() { }

  ngOnInit() {
  }
  onAddServer()
  {
    this.serverCreated.emit({serverName: this.newServerName,serverContent: this.newServerContent});
    // this.serverElements.push({
    // type : 'server',
    // name:'ManneServer',
    // content :'kuch v likho kyaa fark paddta hai'

    // }
    // /)
  }
  onAddBluePrint()
  {
    this.bluePrintCreated.emit({serverName: this.newServerName,serverContent: this.newServerContent})
    // this.serverElements.push({
    // type : 'bluePrint',
    // name:'ManneServer',
    // content :'kuch v likho kyaa fark paddta hai'

    // }
    // )
  }


}
