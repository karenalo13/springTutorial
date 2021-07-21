package ProjectConfi;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import javax.sql.DataSource;

@Configuration
@EnableTransactionManagement
@ComponentScan(basePackages = {"Repositories","ServicesProduct"})
public class ProjectConfig {

@Bean
    public DataSource dataSource(){
        var dataSource= new DriverManagerDataSource();
        dataSource.setUsername("root");
        dataSource.setUrl("jdbc:mysql://localhost:3308/demo");
        dataSource.setPassword("password");
        return dataSource;
    }

    @Bean
    public JdbcTemplate jdbcTemplate(DataSource dataSource){
    var jdbcTemplate = new JdbcTemplate(dataSource);
    return  jdbcTemplate;
    }
@Bean
    public PlatformTransactionManager transactionManager(DataSource dataSource){
    var tm= new DataSourceTransactionManager(dataSource);
    return tm;
    }
}
