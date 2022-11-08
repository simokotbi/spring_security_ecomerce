package com.kotbi.ecommerce.SecurityConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity //By adding @EnableWebSecurity, we get Spring Security and MVC integration support:
public class EmployeeSecurityConfig {

public SecurityFilterChain filterChain(HttpSecurity http)throws Exception{
    http.csrf()
            .disable()
            .authorizeRequests()
            .antMatchers("/employee/**")
            .hasRole("USER")
            .antMatchers("/anonymous*")
            .anonymous()
            .antMatchers("/login*")
            .permitAll()
            .anyRequest()
            .authenticated();

    return http.build();
}

    @Bean
    PasswordEncoder passwordEncoder() {
        return NoOpPasswordEncoder.getInstance();
    }
}
