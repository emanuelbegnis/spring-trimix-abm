package com.trimix.trimixABM.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trimix.trimixABM.model.Persona;
import com.trimix.trimixABM.repository.PersonaRepository;

@Service
public class PersonaService implements IPersonaService {

    @Autowired
    public PersonaRepository persoRepo;

    @Override
    public void crearPersona(Persona per) {
        persoRepo.save(per);
    }


    @Override
    public Persona obtenerPersona(Long id) {

        return persoRepo.findById(id).orElse(null);
    }

    @Override
    public List<Persona> verPersonas() {
        return persoRepo.findAll();
    }

    @Override
    public void borrarPersona(Long id) {
        persoRepo.deleteById(id);
    }

    @Override
    public void modificarPersona(Long id, Persona per) {
       per.setId(id);
       persoRepo.save(per);
    }
}