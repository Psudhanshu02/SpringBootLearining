package com.example.tutorial1_mavin;

import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import java.util.HashMap;


@SpringBootApplication
//@ComponentScan(basePackages = { "org.springdoc", "test.org.springdoc.api.app39" })
public class Tutorial1MavinApplication {

	public static void main(String[] args) {
		SpringApplication.run(Tutorial1MavinApplication.class, args);

    }
	@Bean
	public OpenAPI customOpenAPI() {
		return new OpenAPI()
				.info(new Info()
						.title("Vendor Data")
						.version("5.0")
						.description("Stores Information of Vendor")
						.contact(new Contact().name("sudhanshu").email("abc@gmail.com").extensions(new HashMap<>()))
				)
				.externalDocs(new ExternalDocumentation()
						.description("This Documentation Contains All the Vendor APIs")
						.url("https://example.com/docs"));
	}

}
