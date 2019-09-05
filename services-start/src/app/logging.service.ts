import { Injectable } from "@angular/core";

@Injectable()
export class LoggingService{
    accounts = [
        {
          name: 'Master Account',
          status: 'active'
        },
        {
          name: 'Testaccount',
          status: 'inactive'
        },
        {
          name: 'Hidden Account',
          status: 'unknown'
        }
      ];
      onAccountAdded(accountName: string, accountStatus: string) {
        this.accounts.push({name: accountName,status: accountStatus});
      }
    
      onStatusChanged(id: number, newStatus: string) {
          console.log("statusChange method cale"+ id);
        this.accounts[id].status =newStatus;
      }
}