import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
@Injectable({
  providedIn: 'root'
})
export class DataserviceService {

  constructor(private http: HttpClient) { }

  getmrmbers()
  {
    return this.http.get('http');
  }
}
