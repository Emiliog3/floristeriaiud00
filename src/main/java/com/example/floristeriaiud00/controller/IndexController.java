// Esta clase es un controlador de Spring MVC que maneja peticiones GET a "/home" y "/home/index"

package com.example.floristeriaiud00.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller // Anotación para marcar la clase como un controlador en Spring MVC
@RequestMapping("/home") // URL base para todos los métodos de este controlador


public class IndexController { // Nombre de la clase según convención de nombres

    @GetMapping("/") // Maneja peticiones GET a la raíz de "/home"

    public String index() { // Método para manejar peticiones GET a "/home/"
        return "home2"; // Retorna el nombre lógico de la vista que se debe renderizar (en este caso, "home2")
    }

    @GetMapping("/index") // Maneja peticiones GET a "/home/index"

    public String index2() { // Método para manejar peticiones GET a "/home/index"
        return "home"; // Retorna el nombre lógico de la vista que se debe renderizar (en este caso, "home u index")
    }

}
