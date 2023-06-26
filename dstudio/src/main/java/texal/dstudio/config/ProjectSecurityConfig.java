//package texal.dstudio.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.Customizer;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.http.SessionCreationPolicy;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.web.SecurityFilterChain;
//
//@Configuration
//public class ProjectSecurityConfig {
//        @Bean
//        public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
//
//            http.csrf().disable();
//            http.anonymous();
//            http.headers().frameOptions().disable();
//            http.httpBasic().disable();
//            http.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
//            http.authorizeRequests().antMatchers("/register").permitAll();
//            http.authorizeRequests().anyRequest().authenticated();
//            http.formLogin(Customizer.withDefaults())
//           ;
//            return http.build();
//        }
//
//    @Bean
//    public PasswordEncoder passwordEncoder() {
//        return new BCryptPasswordEncoder();
//    }
//
//}
