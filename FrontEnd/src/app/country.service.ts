import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Country } from './country';

@Injectable({
  providedIn: 'root'
})
export class CountryService {


  private baseURL = "http://localhost:8080/api/v1/countries";

  constructor(private httpClient: HttpClient) { }

  getCountriesList(): Observable<Country[]>  {
    return this.httpClient.get<Country[]>(`${this.baseURL}`);
  }

}
