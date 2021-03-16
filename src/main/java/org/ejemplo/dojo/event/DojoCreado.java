package org.ejemplo.dojo.event;

import co.com.sofka.domain.generic.DomainEvent;
import org.ejemplo.dojo.implement.Nombre;

public class DojoCreado extends DomainEvent {
    private final Nombre nombre;

    public DojoCreado(Nombre nombre) {
        super("dojo.event.crear");
        this.nombre = nombre;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
