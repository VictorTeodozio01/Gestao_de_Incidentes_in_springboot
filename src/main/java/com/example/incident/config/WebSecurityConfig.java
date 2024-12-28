package com.example.incident.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity

public class WebSecurityConfig {

    @SuppressWarnings("deprecation")
    @Bean
    SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .authorizeRequests(authorize -> authorize
                        .requestMatchers("/login", "/resources/**", "/css/**", "/js/**").permitAll()
                        .anyRequest().authenticated()
                        .and()
                        )
                .formLogin(form -> form
                        .loginPage("/login") 
                        .permitAll()
                        .defaultSuccessUrl("/", true)
                        )
                .logout(logout -> logout.permitAll())
                .csrf(csrf -> csrf.disable()) // Desabilita CSRF (somente em desenvolvimento)
                .headers(headers -> headers.frameOptions().disable()); // Desabilita X-Frame-Options

        return http.build();
    }

    @Bean
    UserDetailsService userDetailsService() {
        UserDetails user = User.withUsername("admin").password("{noop}123").roles("USER").build();
        UserDetails root = User.withUsername("root").password("{noop}root").roles("ADMIN").build();
        return new InMemoryUserDetailsManager(user, root);
    }
}