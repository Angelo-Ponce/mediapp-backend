package com.mitocode.model;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * La clase puede usarse como PK compuesta @Embeddable
 * tambien se debe agregar
 * se debe implementar Serializable
 */
@Embeddable
@EqualsAndHashCode
public class ConsultExamPK implements Serializable {

    @ManyToOne
    @JoinColumn(name = "id_consult")
    private Consult consult;

    @ManyToOne
    @JoinColumn(name = "id_exam")
    private Exam exam;
}
