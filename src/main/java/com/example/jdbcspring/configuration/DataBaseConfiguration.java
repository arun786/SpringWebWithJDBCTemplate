package com.example.jdbcspring.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class DataBaseConfiguration {

    @Value("${spring.data.url}")
    private String url;
    @Value("${spring.data.username}")
    private String username;
    @Value("${spring.data.password}")
    private String password;
    @Value("${spring.data.driver}")
    private String driver;

    @Bean
    public DriverManagerDataSource getDataSource() {
        DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
        driverManagerDataSource.setUsername(username);
        driverManagerDataSource.setPassword(password);
        driverManagerDataSource.setUrl(url);
        driverManagerDataSource.setDriverClassName(driver);
        return driverManagerDataSource;
    }

}
