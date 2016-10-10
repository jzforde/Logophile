package quiz.app.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * Enables for Spring Boot to access the H2 database console via url path /console/*
 * Credit for this goes to SpringFrameworkGuru:
 * https://springframework.guru/using-the-h2-database-console-in-spring-boot-with-spring-security/
 */
@Configuration
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity httpSecurity) throws Exception {
        //allowing requests to H2 database console url
        httpSecurity.authorizeRequests().antMatchers("/").permitAll().and()
                .authorizeRequests().antMatchers("/console/**").permitAll();

        //disabling Cross Site Request Forgery (CSRF) protection
        httpSecurity.csrf().disable();

        //disabling X-Frame options header
        httpSecurity.headers().frameOptions().disable();
    }

}
