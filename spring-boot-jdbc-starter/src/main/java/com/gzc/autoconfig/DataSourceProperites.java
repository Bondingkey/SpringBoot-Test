package com.gzc.autoconfig;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author: 拿破仑
 * @Date&Time: 2023/11/05  14:48  周日
 * @Project: SpringBootTest
 * @Write software: IntelliJ IDEA
 * @Purpose: 在此处编辑
 */
@ConfigurationProperties(prefix = "spring.jdbc.datasource")
public class DataSourceProperites {

    private String driverClassName ;
    private String url;
    private String username;
    private String password;

    @Override
    public String toString() {
        return "DataSourceProperites{" +
                "driverClassName='" + driverClassName + '\'' +
                ", url='" + url + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public String getDriverClassName() {
        return driverClassName;
    }

    public void setDriverClassName(String driverClassName) {
        this.driverClassName = driverClassName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
