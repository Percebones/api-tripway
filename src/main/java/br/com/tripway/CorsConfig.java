package br.com.tripway;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig {

    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**") // Libera todos os endpoints
                        .allowedOrigins("*") // Libera qualquer origem
                        .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS") // Libera todos os métodos
                        .allowedHeaders("*") // Libera todos os headers
                        .allowCredentials(false); // Se quiser permitir cookies, coloque true (mas * não funciona com credentials)
            }
        };
    }
}
