package com.casestudy.katsaras.service;

import com.casestudy.katsaras.model.CountryModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

//@Repository
@CrossOrigin("http://localhost:4200")
public interface CountryService extends JpaRepository<CountryModel,Integer> {
}



