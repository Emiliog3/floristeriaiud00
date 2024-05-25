/*
Esta clase es la encargada de ejecutar la aplicación. Se encarga de inicializar el contexto de Spring y de lanzar la aplicación.
Es decir, es la clase principal de la aplicación.
Por ejemplo, en el método main se llama al método run de la clase SpringApplication para lanzar la aplicación.
Esto permite que la aplicación se ejecute y se pueda acceder a ella a través de un navegador web.
 */


package com.example.floristeriaiud00;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Floristeriaiud00Application {

	public static void main(String[] args) {
		SpringApplication.run(Floristeriaiud00Application.class, args);
		System.out.println("La aplicación se ejecutó correctamente.");
	}

}
