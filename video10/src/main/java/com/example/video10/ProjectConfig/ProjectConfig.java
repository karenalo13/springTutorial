package com.example.video10.ProjectConfig;

import javax.sql.DataSource;

import org.springframework.boot.autoconfigure.batch.BatchProperties.Jdbc;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;


@Configuration
public class ProjectConfig {
	
	@Bean
	public JdbcTemplate jdbcTemplate(DataSource dataSource) {
		return new JdbcTemplate(dataSource);
	}

}
