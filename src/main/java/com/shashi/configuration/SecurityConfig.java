package com.shashi.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.shashi.security.CustomUserDetailService;


@Configuration
@EnableWebSecurity
@ComponentScan(basePackageClasses = CustomUserDetailService.class)
public class SecurityConfig extends WebSecurityConfigurerAdapter{

	@Autowired
    private UserDetailsService userDetailsService;
	
	@Autowired
	public void configureAuthentication(AuthenticationManagerBuilder auth) throws Exception {
        auth
            .userDetailsService(userDetailsService);
    }
	/*protected void configureAuthentication( AuthenticationManagerBuilder auth)
			throws Exception {
		auth.inMemoryAuthentication().withUser("user").password("user").roles("USER").and()
		.withUser("admin").password("admin").roles("USER","ADMIN");
	}*/
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
		.anyRequest().authenticated()
		.and()
		.formLogin().permitAll()
		.and()
		.logout().permitAll();
	}
	
	@Bean(name="passwordEncoder")
    public PasswordEncoder passwordencoder(){
     return new BCryptPasswordEncoder();
    }
}
