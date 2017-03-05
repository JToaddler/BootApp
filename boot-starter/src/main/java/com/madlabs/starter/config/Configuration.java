package com.madlabs.starter.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.JdbcTemplate;

@org.springframework.context.annotation.Configuration
@ConfigurationProperties()
public class Configuration {

	private String webKey;
	private String restKey;

	public void setWebKey(String webKey) {
		this.webKey = webKey;
	}

	public void setRestKey(String restKey) {
		this.restKey = restKey;
	}

	@Bean(name = "hrDataSource")
	@Primary
	@ConfigurationProperties(prefix = "spring.hr")
	public DataSource hrDataSource() {
		return DataSourceBuilder.create().build();
	}

	@Bean(name = "adminDataSource")
	@ConfigurationProperties(prefix = "spring.adminDatasource")
	public DataSource adminDataSource() {
		return DataSourceBuilder.create().build();
	}

	@Bean(name = "hrJdbcTemplate")
	public JdbcTemplate getHrJdbcTemplate(@Qualifier("hrDataSource") DataSource ds) {
		return new JdbcTemplate(ds);
	}

	@Bean(name = "adminJdbcTemplate")
	public JdbcTemplate getAdminJdbcTemplate(@Qualifier("adminDataSource") DataSource ds) {
		return new JdbcTemplate(ds);
	}

}
