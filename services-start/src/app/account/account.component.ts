import { Component, EventEmitter, Input, Output } from '@angular/core';
import { LoggingService } from '../logging.service';

@Component({
  selector: 'app-account',
  templateUrl: './account.component.html',
  styleUrls: ['./account.component.css'],
})
export class AccountComponent {
  @Input() account: {name: string, status: string};
  @Input() id: number;

  constructor(private logging: LoggingService)
  {

  }

  onSetTo(status: string) {
    console.log("calling onsetto method")
    this.logging.onStatusChanged(this.id,status);
    console.log('A server status changed, new status: ' + status);
  }
}
