package com.dia17.dia17.configuration;


import com.dia17.dia17.model.User;
import com.dia17.dia17.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class UserConfiguration extends WebSecurityConfigurerAdapter {

    @Autowired
    private UserRepository ur;

    @Override
    public void configure(HttpSecurity security) throws Exception {
        security.authorizeRequests()
                .anyRequest()
                .fullyAuthenticated()
                .and()
                .httpBasic()
                .and()
                .cors()
                .and()
                .csrf()
                .disable();
    }

    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }

    @Autowired
    protected  void configureGlobal(AuthenticationManagerBuilder amb) throws Exception{
        amb.userDetailsService(username -> {
            User user = ur.findByUsername(username);
            if(user == null){
                throw new UsernameNotFoundException("User not fount"+username);
            }else{
                return new org.springframework.security.core.userdetails.User(user.getUsername(),user.getPassword(),true,true,true,true, AuthorityUtils.createAuthorityList("user"));
            }
        });
    }
}

