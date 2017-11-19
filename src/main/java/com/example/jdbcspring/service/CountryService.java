package com.example.jdbcspring.service;

import com.example.jdbcspring.bean.Country;

import java.util.List;

public interface CountryService {
    List<Country> getCountry();
    Long countOfCountry();
}
