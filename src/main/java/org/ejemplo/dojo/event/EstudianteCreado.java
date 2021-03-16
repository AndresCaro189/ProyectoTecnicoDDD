package org.ejemplo.dojo.event;

import co.com.sofka.domain.generic.DomainEvent;
import org.ejemplo.dojo.implement.Nombre;
import org.ejemplo.dojo.implement.NombreEstudiante;

public class EstudianteCreado extends DomainEvent {
    private final NombreEstudiante nombreEstudiante;

    public EstudianteCreado(NombreEstudiante nombreEstudiante) {
        super("dojo.event.EstudianteCreado");
        this.nombreEstudiante = nombreEstudiante;
    }

    public NombreEstudiante getNombreEstudiante() {
        return nombreEstudiante;
    }
}
