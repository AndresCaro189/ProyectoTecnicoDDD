package org.ejemplo.dojo;

import co.com.sofka.domain.generic.DomainEvent;

public class DojoCreado extends DomainEvent {
    private final Nombre nombre;

    public DojoCreado(Nombre nombre) {
        super("dojo.crear");
        this.nombre = nombre;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
