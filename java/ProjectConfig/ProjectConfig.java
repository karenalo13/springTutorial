package ProjectConfig;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
@ComponentScan(basePackages = {"repository"})
public class ProjectConfig {

@Bean
    public DataSource datasource(){
        var datasource=new DriverManagerDataSource();
        datasource.setUrl("jdbc:mysql://localhost:3308/demo");
        datasource.setUsername("root");
        datasource.setPassword("password");
        return datasource;
    }
    @Bean
    public JdbcTemplate jdbcTemplate(DataSource dataSource)
    {
        return new JdbcTemplate(dataSource);
    }
}
