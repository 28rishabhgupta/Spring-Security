package com.trial;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity(debug=true)
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		// TODO Auto-generated method stub
		auth.inMemoryAuthentication()
		.withUser("Rishabh")
		.password("{bcrypt}$2a$10$omKFwWzU1td2m/I4mahFCOGjz79hNr2.kAGL6hfZEtOd4pszktgGK")
		.roles("admin");
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		// TODO Auto-generated method stub
		http
		.authorizeRequests()
		//.anyRequest()
		.antMatchers("/hi").authenticated()
		.antMatchers("/hello").authenticated()
		.antMatchers("/Ramji").permitAll()
		.and()
		 .formLogin()
		 .and()
		 .httpBasic();
		
	}
}
