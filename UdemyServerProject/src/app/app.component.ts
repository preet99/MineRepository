import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  serverElements = [];
  title = 'UdemyServerProject';
  onServerAdd(serverData: {severName: string, serverContent; string})
  {
    this.serverElements.push({
      type: 'server',
      content: serverData.serverContent,
      name: serverData.severName
    }
    )
    ;
  }
}
