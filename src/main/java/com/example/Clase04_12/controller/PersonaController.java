package com.example.Clase04_12.controller;

import com.example.Clase04_12.model.Persona;
import org.springframework.stereotype.Controller;
import com.example.Clase04_12.repository.PersonaRepository;
import java.util.List;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PersonaController {
    private final PersonaRepository personaRepository;
    
    public PersonaController(PersonaRepository personaRepository){
        this.personaRepository = personaRepository;
    }
    
    @GetMapping("/personas")
    public String listarPersona(Model model){
        List<Persona> personas = personaRepository.findAll();
        model.addAttribute("personas", personas);
        return "personas"; // Busca personas.html en /templates
    }
}
