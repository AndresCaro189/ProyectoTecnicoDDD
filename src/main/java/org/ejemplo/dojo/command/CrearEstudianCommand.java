package org.ejemplo.dojo.command;

import co.com.sofka.domain.generic.Command;
import org.ejemplo.dojo.implement.NombreEstudiante;
import org.ejemplo.dojo.value.DojoId;

import java.util.Map;
import java.util.Objects;

public class CrearEstudianCommand implements Command {
    private final DojoId dojoId;
    private final NombreEstudiante nombreEstudiante;

    public CrearEstudianCommand(DojoId dojoId, NombreEstudiante nombreEstudiante) {
        this.dojoId = dojoId;
        this.nombreEstudiante = Objects.requireNonNull(nombreEstudiante);
    }

    public DojoId getDojoId() {
        return dojoId;
    }

    public NombreEstudiante getNombreEstudiante() {
        return nombreEstudiante;
    }
}
