package com.gzc.autoconfig;

import com.alibaba.druid.pool.DruidDataSource;
import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

/**
 * @author: 拿破仑
 * @Date&Time: 2023/11/05  14:53  周日
 * @Project: SpringBootTest
 * @Write software: IntelliJ IDEA
 * @Purpose: 在此处编辑
 */
@SpringBootConfiguration//声明当前类是一个配置类
@EnableConfigurationProperties(DataSourceProperites.class)
public class DataSourceAutoConfiguration {

    @Autowired
    private DataSourceProperites dataSourceProperties ;

    @Bean
    @ConditionalOnProperty(value = "spring.jdbc.datasource.type",havingValue = "druid")
    public DataSource createDataSource(){
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName(dataSourceProperties.getDriverClassName());
        dataSource.setUrl(dataSourceProperties.getUrl());
        dataSource.setUsername(dataSourceProperties.getUsername());
        dataSource.setPassword(dataSourceProperties.getPassword());
        return dataSource;
    }

    @Bean
    @ConditionalOnProperty(value = "spring.jdbc.datasource.type",havingValue = "c3p0")
    public DataSource createC3P0DataSource() throws Exception{
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        dataSource.setDriverClass(dataSourceProperties.getDriverClassName());
        dataSource.setJdbcUrl(dataSourceProperties.getUrl());
        dataSource.setUser(dataSourceProperties.getUsername());
        dataSource.setPassword(dataSourceProperties.getPassword());
        return dataSource;
    }


}
