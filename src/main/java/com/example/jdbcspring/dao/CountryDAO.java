package com.example.jdbcspring.dao;

import com.example.jdbcspring.bean.Country;

import java.util.List;

public interface CountryDAO {
    List<Country> getCountry();
    Long countOfCountry();
}
