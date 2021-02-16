package it.sirfin.catalogoprodottiserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages= {"it.sirfin.catalogoprodottiserver"})
@EnableJpaRepositories(basePackages= {"it.sirfin.catalogoprodottiserver.repository"})
@EntityScan(basePackages= {"it.sirfin.catalogoprodottiserver.model"})
public class CatologoProdottiServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CatologoProdottiServerApplication.class, args);
	}

}
