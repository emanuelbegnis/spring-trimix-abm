package com.trimix.trimixABM.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.trimix.trimixABM.model.Persona;
import com.trimix.trimixABM.service.IPersonaService;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class Controller {

    @Autowired
    private IPersonaService personaService;

    @GetMapping("/personas")
    public List<Persona> verPersonas() {
        return personaService.verPersonas();
    }

    @GetMapping("/persona/{id}")
    public Persona obtenerPersona(@PathVariable Long id) {
        return personaService.obtenerPersona(id);
    }

    @PostMapping("/persona")
    public void agregarPersona(@RequestBody Persona persona) {
        personaService.crearPersona(persona);
    }

    @DeleteMapping("/borrar/{id}")
    public void borrarPersona(@PathVariable Long id) {
        personaService.borrarPersona(id);
    }

    @PutMapping("/persona/{id}")
    public void modificarPersona(@PathVariable Long id, @RequestBody Persona persona) {
        personaService.modificarPersona(id, persona);
    }
}
