package com.zlb.client.config.dataconfig;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

@Configuration
public class DataSourceConfig {
    private static final Logger log = LoggerFactory.getLogger(DataSourceConfig.class);

    @Bean(name = "master")
    @Primary
    @ConfigurationProperties("spring.datasource.druid.fortuna_manager")
    public DataSource dataSourceMaster() {
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "fortuna")
    @ConfigurationProperties("spring.datasource.druid.fortuna")
    public DataSource dataSourceFortuna() {
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "platform")
    @ConfigurationProperties("spring.datasource.druid.bf_platform")
    public DataSource dataSourcePlatform() {
        return DataSourceBuilder.create().build();
    }
}
