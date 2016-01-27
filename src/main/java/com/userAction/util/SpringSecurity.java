package com.userAction.util;

import com.userAction.service.AnthenticationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;

/**
 * Created by ${AbhilashKeerthi} on 1/8/16.
 */

@Configuration
@EnableWebSecurity
public class SpringSecurity extends WebSecurityConfigurerAdapter {


    @Autowired
    @Qualifier("anthenticationService")
    AnthenticationService anthenticationService;

    @Autowired
    public void configureGlobalSecurity(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication().withUser("bill").password("abc123").roles("USER");
        auth.inMemoryAuthentication().withUser("admin").password("root123").roles("ADMIN");
        auth.inMemoryAuthentication().withUser("dba").password("root123").roles("ADMIN","DBA");


        // auth.userDetailsService(anthenticationService
       // );
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {

        http.authorizeRequests()
                .antMatchers("/", "home").permitAll()                         // permit all for these above URL
                .antMatchers("/services/**").access("hasRole('ROLE_ADMIN')")                           // should have the specified role to acces all services below these URL
                .antMatchers("/admin/**").access("hasRole('ROLE_ADMIN') or hasRole('ROLE_DBA')")      // should have the specified role to acces all services below these URL
                .and().formLogin().loginPage("/login")                                               // for loging forward the request for these URL
                .usernameParameter("ssoId").passwordParameter("password")
                .and().csrf()
                .and().exceptionHandling().accessDeniedPage("/Access_Denied");        // for any problem in login then forward to these URL and it will take care of handeling the ERROR

    }

}

