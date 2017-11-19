package com.example.jdbcspring.mapper;

import com.example.jdbcspring.bean.Country;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CountryMapper implements RowMapper<Country> {

    @Override
    public Country mapRow(ResultSet rs, int rowNum) throws SQLException {
        Country c = new Country(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4));
        return c;
    }
}
