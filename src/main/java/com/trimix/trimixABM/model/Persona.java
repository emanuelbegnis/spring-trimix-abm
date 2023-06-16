package com.trimix.trimixABM.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String perApellido;
    private String perFechaNacimiento;
    private String perNombre;
    private Long perNumeroDocumento;
    private String perTipoDocumento;

    public Persona() {
        
    }

    public Persona(Long id, String perApellido, String perFechaNacimiento, String perNombre, Long perNumeroDocumento, String perTipoDocumento) {
        this.id = id;
        this.perNombre = perNombre;
        this.perApellido = perApellido;
        this.perFechaNacimiento = perFechaNacimiento;
        this.perNumeroDocumento = perNumeroDocumento;
        this.perTipoDocumento = perTipoDocumento;
    }
}
