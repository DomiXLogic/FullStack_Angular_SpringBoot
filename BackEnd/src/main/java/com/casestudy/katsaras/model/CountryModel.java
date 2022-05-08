package com.casestudy.katsaras.model;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name="countries")

public class CountryModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "country_id")
      Integer country_id;

    @Column(name = "name")
      String name;

    @Column(name = "area")
      BigDecimal area;

    @Column(name = "national_day")
      Date national_day;

    @Column(name = "country_code2")
      String country_code2;

    @Column(name = "country_code3")
      String country_code3;

    @Column(name = "region_id")
      Integer region_id;


}
