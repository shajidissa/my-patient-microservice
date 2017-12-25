package com.thoughtmechanix.organization.security;


import org.springframework.context.annotation.Configuration;

import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AnonymousAuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;

@Configuration
public class ResourceServerConfiguration extends ResourceServerConfigurerAdapter {


    @Override
    public void configure(HttpSecurity http) throws Exception{
        
    	// http.authenticationProvider(new AnonymousAuthenticationProvider("default"));
    	 
    	/*
    	http
        .authorizeRequests()
          .antMatchers(HttpMethod.DELETE, "/v1/organizations/**")
          .hasRole("ADMIN")
          .anyRequest()
          .authenticated();
        */
        
    	http.authorizeRequests()
        .antMatchers("/swagger-ui.html").permitAll()
        .anyRequest().permitAll();
        
    
    }
    
   
}
