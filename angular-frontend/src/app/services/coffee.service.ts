import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable, throwError } from 'rxjs';
import { catchError, retry } from 'rxjs/operators';
import { Coffee } from '../models/coffee';

@Injectable({
  providedIn: 'root'
})
export class CoffeeService {
  apiUrl = 'http://localhost:8080/api/v1/coffee';
  constructor(private http: HttpClient) { }

  getAll(){
    return this.http.get<Coffee[]>(this.apiUrl+'/all');      
  }
}
