package com.example.jdbcspring.dao;

import com.example.jdbcspring.bean.Country;
import com.example.jdbcspring.mapper.CountryMapper;
import com.example.jdbcspring.util.SQL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public class CountryDAOImpl implements CountryDAO {

    @Autowired
    private SQL sql;

    @Override
    public List<Country> getCountry() {
        List<Country> str = sql.query("select * from country", new CountryMapper());
        return str;
    }

    public Long countOfCountry(){
        Long l = sql.queryForObject("select count(*) from country", Long.class);
        return l;
    }


}
