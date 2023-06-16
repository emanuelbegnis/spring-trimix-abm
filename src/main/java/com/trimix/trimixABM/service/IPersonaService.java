package com.trimix.trimixABM.service;

import java.util.List;

import com.trimix.trimixABM.model.Persona;

public interface IPersonaService {

    public void crearPersona(Persona persona);

    public void modificarPersona(Long id, Persona per);

    public Persona obtenerPersona(Long id);

    public List<Persona> verPersonas();

    public void borrarPersona(Long id);

}