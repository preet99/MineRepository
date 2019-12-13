package com.manpreet.UdemyMicroserviceProject;

import java.util.Locale;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

@SpringBootApplication
@ComponentScan(basePackages = {"com.manpreet"})
@EnableAutoConfiguration(exclude = JpaRepositoriesAutoConfiguration.class)
public class UdemyMicroserviceProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(UdemyMicroserviceProjectApplication.class, args);
	}
	
	 @Bean
	    public LocaleResolver localeResolver(){
	        SessionLocaleResolver r = new SessionLocaleResolver();
	        r.setDefaultLocale(Locale.US);
	        return r;
	    }
	
	@Bean
	public ResourceBundleMessageSource resourceBundleMessageSource()
	{   
		ResourceBundleMessageSource resource = new ResourceBundleMessageSource();
		resource.setBasename("message");
		
		return resource;
		
	}

}
