package com.slk.capture;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests().antMatchers("/bower_components/**", "/*.js", "/*.jsx", "/main.css").permitAll()
				.anyRequest().authenticated().and().formLogin().defaultSuccessUrl("/", true).permitAll().and()
				.httpBasic().and().csrf().disable().logout().logoutSuccessUrl("/");
	}

	/***
	 * Change and provide our own authentication manager in future
	 * 
	 * @param auth
	 * @throws Exception
	 */
	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication().withUser("Abhinav").password("Messi1010");
	}
}
