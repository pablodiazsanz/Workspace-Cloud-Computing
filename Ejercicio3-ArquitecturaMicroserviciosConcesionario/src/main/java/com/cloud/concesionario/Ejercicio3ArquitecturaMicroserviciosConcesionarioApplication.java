package com.cloud.concesionario;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Ejercicio3ArquitecturaMicroserviciosConcesionarioApplication {

	public static void main(String[] args) {
		SpringApplication.run(Ejercicio3ArquitecturaMicroserviciosConcesionarioApplication.class, args);
	}

}
