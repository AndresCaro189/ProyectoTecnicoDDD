package org.ejemplo.dojo.command;

import co.com.sofka.domain.generic.Command;
import org.ejemplo.dojo.implement.Estado;
import org.ejemplo.dojo.value.DojoId;

public class EliminarEstudianteCommand implements Command {
    private final DojoId dojoId;
    private final Estado estado;

    public EliminarEstudianteCommand(DojoId dojoId, Estado estado) {
        this.dojoId = dojoId;
        this.estado = estado;
    }

    public DojoId getDojoId() {
        return dojoId;
    }
}
