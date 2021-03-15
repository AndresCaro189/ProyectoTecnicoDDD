package org.ejemplo.dojo;

import co.com.sofka.domain.generic.ValueObject;

public class Calificacion implements ValueObject<Integer> {
    private final Integer value;

    public Calificacion(Integer value) {
        //TODO: agregar las validaciones para el valor de calificacion
        this.value = value;
    }

    @Override
    public Integer value() {
        return value;
    }
}
