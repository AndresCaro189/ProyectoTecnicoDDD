package org.ejemplo.dojo;

import co.com.sofka.domain.generic.DomainEvent;

public class DojoAbierto extends DomainEvent {
    public DojoAbierto() {
        super("dojo.dojoabierto");
    }
}
