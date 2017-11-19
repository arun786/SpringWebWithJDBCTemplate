package com.example.jdbcspring.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.util.List;

@Component
public class SQL {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public SQL(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public <T> List<T> query(String sql, RowMapper<T> rowMapper) {
        return this.jdbcTemplate.query(sql, rowMapper);
    }

    public <T> T queryForObject(String sql, Class<T> t){
        return this.jdbcTemplate.queryForObject(sql,t);
    }


}
