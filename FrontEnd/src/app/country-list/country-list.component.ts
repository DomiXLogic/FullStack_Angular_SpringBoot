import { Component, OnInit } from '@angular/core';
import { Country } from '../country';
import { CountryService } from '../country.service';

@Component({
  selector: 'app-country-list',
  templateUrl: './country-list.component.html',
  styleUrls: ['./country-list.component.css']
})
export class CountryListComponent implements OnInit {

  countries: Country[]= [];

  constructor(private countryService: CountryService) { }

  ngOnInit(): void {
    this.getCountries();

  }

  private getCountries(){
    this.countryService.getCountriesList().subscribe(data =>{
      this.countries = data;
    })
  }
}
