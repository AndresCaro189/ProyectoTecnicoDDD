package org.ejemplo.dojo.command;

import co.com.sofka.domain.generic.Command;
import org.ejemplo.dojo.implement.Nombre;

import java.util.Objects;

public class CrearDojoCommand implements Command {
    private final Nombre nombre;

    public CrearDojoCommand(Nombre nombre) {
        this.nombre = Objects.requireNonNull(nombre);
    }

    public Nombre getNombre() {
        return nombre;
    }
}
