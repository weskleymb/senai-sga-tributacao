package br.gov.rn.saogoncalo.tributacaoapi.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Override //configurar autenticações
    public void configure(AuthenticationManagerBuilder auth) throws Exception {
//        auth.userDetailsService(usuario)
    }

    @Override //configurar autorizações
    public void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers(HttpMethod.GET, "/teste").permitAll()
                .anyRequest().authenticated()
                .and()
                .formLogin();
    }

    @Override //configurar arquivos estaticos da aplicação
    public void configure(WebSecurity web) throws Exception {
        super.configure(web);
    }

}
