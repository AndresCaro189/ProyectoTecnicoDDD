package org.ejemplo.dojo.event;

import co.com.sofka.domain.generic.DomainEvent;
import org.ejemplo.dojo.implement.Nombre;

public class DojoAbierto extends DomainEvent {
    private final Nombre nombre;

    public DojoAbierto(Nombre nombre) {
        super("dojo.event.dojoabierto");
        this.nombre = nombre;
    }

    public Nombre getNombre() {
        return nombre;
    }

}
