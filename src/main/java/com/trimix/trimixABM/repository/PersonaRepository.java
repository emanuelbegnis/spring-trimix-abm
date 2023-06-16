package com.trimix.trimixABM.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.trimix.trimixABM.model.Persona;

public interface PersonaRepository extends JpaRepository<Persona, Long> {
    
}
