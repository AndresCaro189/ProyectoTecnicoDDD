package org.ejemplo.dojo;

import co.com.sofka.domain.generic.Command;

public class CrearDojoCommand implements Command {

    private final Nombre nombre;

    public CrearDojoCommand(Nombre nombre) {
        this.nombre = nombre;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
