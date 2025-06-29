package springapp1.actividad4.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String home() {
        return "Nombre: Alejandro Pardo <br> Matrícula: AL07003706 <br> Escuela: Universidad Tecmilenio <br> Materia: Programacion avanzada en Java <br> Profesor: Jose Alfredo Jimenez Hernandez";
    }

    @GetMapping("/health")
    public String health() {
        return "Aplicación funcionando correctamente en GlassFish";
    }
}
