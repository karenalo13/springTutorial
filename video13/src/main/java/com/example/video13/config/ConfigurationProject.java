package com.example.video13.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class ConfigurationProject extends WebSecurityConfigurerAdapter {

	
	@Bean
	public PasswordEncoder PasswordEncoder() {
		return NoOpPasswordEncoder.getInstance();
	}
	
	
	@Bean
	public UserDetailsService userDetailsService() {
		InMemoryUserDetailsManager manager=new InMemoryUserDetailsManager();
		UserDetails u1=User.withUsername("bill").password("12345")
				.roles("Manager")
				.authorities("read")
				.build();
		
		UserDetails u2=User.withUsername("andrei").password("01234567")
				.roles("ADMIN")
				.authorities("write")
				.build();
		manager.createUser(u1);
		
		manager.createUser(u2);
		
		return manager;
	}


	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.httpBasic();
		 http.authorizeRequests()
         .antMatchers(HttpMethod.GET, "/hello")
             .access("hasAuthority('write')")
         .anyRequest().permitAll();
		
	}
	
	
	
}
