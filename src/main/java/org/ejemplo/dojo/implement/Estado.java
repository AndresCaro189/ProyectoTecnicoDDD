package org.ejemplo.dojo.implement;

import co.com.sofka.domain.generic.ValueObject;

public class Estado implements ValueObject<Integer> {
    private boolean estadoEstudiante;

    public Estado(boolean estadoEstudiante) {
        this.estadoEstudiante = estadoEstudiante;
    }

    @Override
    public Integer value() {
        return null;
    }
}
