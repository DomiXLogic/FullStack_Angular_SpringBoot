package com.casestudy.katsaras.Controllers;

import com.casestudy.katsaras.model.CountryModel;
import com.casestudy.katsaras.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/")
@CrossOrigin(origins = "http://localhost:4200")
public class CountryController {

    @Autowired
    CountryService countryService;

    @GetMapping(path = "countries")
    List<CountryModel> getCountry(){
        return countryService.findAll();

    }

}
