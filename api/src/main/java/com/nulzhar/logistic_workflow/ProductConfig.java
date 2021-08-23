package com.nulzhar.logistic_workflow;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class ProductConfig {

    @Bean
    CommandLineRunner commandLineRunner(ProductRepository productRepository){
        return args -> {
            Product capacete = new Product(
                    "Capacete 1",
                    10.0
            );
            Product capacete2 = new Product(
                    "Capacete 2",
                    10.0
            );
            productRepository.saveAll(List.of(capacete, capacete2));
        };
    }
}
