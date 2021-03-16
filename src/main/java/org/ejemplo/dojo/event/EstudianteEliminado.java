package org.ejemplo.dojo.event;

import co.com.sofka.domain.generic.DomainEvent;
import org.ejemplo.dojo.value.EstudianteId;

public class EstudianteEliminado extends DomainEvent {
    private final EstudianteId estudianteId;

    public EstudianteEliminado(EstudianteId estudianteId) {
        super("dojo.event.EstudianteEliminado");
        this.estudianteId = estudianteId;
    }

    public EstudianteId getEstudianteId() {
        return estudianteId;
    }
}
