package org.ejemplo.dojo;

import co.com.sofka.domain.generic.EventChange;

import java.util.HashSet;

public class DojoChange extends EventChange {
    public DojoChange(Dojo dojo) {
        apply((DojoCreado event)-> {
            dojo.abierto = Boolean.FALSE;
            dojo.estudiantes = new HashSet<>();
            dojo.nombre = event.getNombre();
        });

        apply((DojoAbierto event)-> {
            //TODO: cambiar el valor del estado
        });
    }
}
