package wl.hdzj;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.session.SessionRegistry;
import org.springframework.security.core.session.SessionRegistryImpl;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.session.HttpSessionEventPublisher;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;
import wl.hdzj.domain.UserRepository;
import wl.hdzj.service.MyUserDetailsService;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
            .sessionManagement()
                .sessionCreationPolicy(SessionCreationPolicy.IF_REQUIRED)
                .sessionFixation().changeSessionId()
                .maximumSessions(1)
                .maxSessionsPreventsLogin(true)
                .expiredUrl("/index")
                .sessionRegistry(sessionRegistry());
        http
            .authorizeRequests()
                .antMatchers("/css/**", "/fonts/**", "/images/**", "/img/**", "/js/**", "/*").permitAll()
                .anyRequest().authenticated()
                .and()
            .formLogin()
                .successForwardUrl("/success")
                .loginPage("/login").permitAll()
                .and()
            .logout()
                .logoutUrl("/logout")
                //.logoutSuccessHandler()
                .invalidateHttpSession(true)
                //.addLogoutHandler()
                .deleteCookies();
    }

    @Bean
    public SessionRegistry sessionRegistry() {
        return new SessionRegistryImpl();
    }

    @Bean
    public HttpSessionEventPublisher httpSessionEventPublisher(){
        return new HttpSessionEventPublisher();
    }

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth, UserRepository userRepository) throws Exception {
        auth
            .userDetailsService(new MyUserDetailsService(userRepository));
    }

    @Bean
    public JedisConnectionFactory connectionFactory(){
        return new JedisConnectionFactory();
    }
}
