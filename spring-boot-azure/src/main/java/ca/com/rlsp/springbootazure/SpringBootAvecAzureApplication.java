package ca.com.rlsp.springbootazure;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
@SpringBootApplication
public class SpringBootAvecAzureApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAvecAzureApplication.class, args);
	}

}
