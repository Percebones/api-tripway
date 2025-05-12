package br.com.tripway.api;

import java.time.LocalDate;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.client.RestTemplate;

import controller.ClienteControler;
import model.Cliente;

@SpringBootApplication
@ComponentScan(basePackages = {"br.com.tripway.api", "repository", "service", "model"})
public class Teste {
	
	
	
	Cliente cliente = new Cliente(
            LocalDate.of(1990, 5, 12), // data_nascimento
            "123.456.789-00",          // cpf
            "Thiago Percebon",         // nome
            "(41) 99999-9999",         // phone
            'M',                        // sexo
            "thiago@email.com"         // email
        );
    public static void main(String[] args) {
        SpringApplication.run(Teste.class, args);
    }

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    @Bean
    public CommandLineRunner run(RestTemplate restTemplate, ClienteControler clienteControler) {
        return args -> {
            clienteControler.adicionarCliente(cliente);
        };
    }
}

