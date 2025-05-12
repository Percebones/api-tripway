package br.com.tripway.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = {"br.com.tripway.model"})
public class TripwayApplication {

	public static void main(String[] args) {
		SpringApplication.run(TripwayApplication.class, args);
	}

}
