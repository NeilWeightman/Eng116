package com.baeldung.sessionattrs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.core.Ordered;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.annotation.SessionScope;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.thymeleaf.templatemode.TemplateMode;
import org.thymeleaf.templateresolver.ClassLoaderTemplateResolver;
import org.thymeleaf.templateresolver.ITemplateResolver;

@EnableWebMvc
@EnableWebSecurity
@Configuration
public class Config extends WebSecurityConfigurerAdapter {

    @Bean
    @Scope(
        value = WebApplicationContext.SCOPE_SESSION, 
        proxyMode = ScopedProxyMode.TARGET_CLASS)
    public TodoList todos() {
        return new TodoList();
    }

    @Bean
    public ITemplateResolver templateResolver() {
        ClassLoaderTemplateResolver resolver 
            = new ClassLoaderTemplateResolver();
        resolver.setPrefix("templates/sessionattrs/");
        resolver.setSuffix(".html");
        resolver.setTemplateMode(TemplateMode.HTML);
        resolver.setCharacterEncoding("UTF-8");
        return resolver;
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        // creates an in-memory user registry
        auth.inMemoryAuthentication().withUser("Tina").password("{noop}secret123").authorities("ADMIN");
        auth.inMemoryAuthentication().withUser("Reman").password("{noop}passw0rd").authorities("USER");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/form").hasAnyAuthority("ADMIN")
                .antMatchers("/todos").permitAll()
                .anyRequest().authenticated()
                .and().formLogin().loginPage("/login").defaultSuccessUrl("/todos", true).permitAll()
                .and().exceptionHandling().accessDeniedPage("/accessDenied");
    }
}
