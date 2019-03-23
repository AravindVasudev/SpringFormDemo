package io.github.aravindvasudev.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "io.github.aravindvasudev.springformdemo")
public class AppConfig {
    @Bean
    public ViewResolver viewResolver() {
        InternalResourceViewResolver irv = new InternalResourceViewResolver();

        irv.setPrefix("/");
        irv.setSuffix(".jsp");

        return irv;
    }
}
