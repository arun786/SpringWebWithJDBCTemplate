package com.example.jdbcspring.service;

import com.example.jdbcspring.bean.Country;
import com.example.jdbcspring.dao.CountryDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryServiceImpl implements CountryService {

    @Autowired
    private CountryDAO countryDAO;

    @Override
    public List<Country> getCountry() {
        return countryDAO.getCountry();
    }

    @Override
    public Long countOfCountry() {
        return countryDAO.countOfCountry();
    }
}
