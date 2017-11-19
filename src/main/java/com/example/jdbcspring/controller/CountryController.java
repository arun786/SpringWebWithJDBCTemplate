package com.example.jdbcspring.controller;


import com.example.jdbcspring.bean.Country;
import com.example.jdbcspring.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CountryController {

    @Autowired
    private CountryService countryService;

    @GetMapping(value = "/country")
    public @ResponseBody
    List<Country> getCountry() {
        List<Country> c = countryService.getCountry();
        return c;
    }

    @GetMapping(value = "/country/all")
    public @ResponseBody Long countOfCountry(){
        return countryService.countOfCountry();
    }
}
