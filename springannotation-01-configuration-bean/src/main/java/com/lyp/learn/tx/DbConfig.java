package com.lyp.learn.tx;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @Author: liyapu
 * @Description:
 * @create: 2019-08-04 09:37
 */
@Configuration
@PropertySource("classpath:jdbc.properties")
public class DbConfig {
    @Value("${jdbc.username}")
    private String jdbcUsername;
    @Value("${jdbc.password}")
    private String jdbcPassword;
    @Value("${jdbc.url}")
    private String jdbcUrl;
    @Value("${jdbc.driver}")
    private String jdbcDriver;

    public String getJdbcUsername() {
        return jdbcUsername;
    }

    public void setJdbcUsername(String jdbcUsername) {
        this.jdbcUsername = jdbcUsername;
    }

    public String getJdbcPassword() {
        return jdbcPassword;
    }

    public void setJdbcPassword(String jdbcPassword) {
        this.jdbcPassword = jdbcPassword;
    }

    public String getJdbcUrl() {
        return jdbcUrl;
    }

    public void setJdbcUrl(String jdbcUrl) {
        this.jdbcUrl = jdbcUrl;
    }

    public String getJdbcDriver() {
        return jdbcDriver;
    }

    public void setJdbcDriver(String jdbcDriver) {
        this.jdbcDriver = jdbcDriver;
    }

    @Override
    public String toString() {
        return "DbConfig{" +
                "jdbcUsername='" + jdbcUsername + '\'' +
                ", jdbcPassword='" + jdbcPassword + '\'' +
                ", jdbcUrl='" + jdbcUrl + '\'' +
                ", jdbcDriver='" + jdbcDriver + '\'' +
                '}';
    }
}
