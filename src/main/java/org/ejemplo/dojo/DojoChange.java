package org.ejemplo.dojo;

import co.com.sofka.domain.generic.EventChange;
import org.ejemplo.dojo.event.DojoAbierto;
import org.ejemplo.dojo.event.DojoCreado;
import org.ejemplo.dojo.event.EstudianteCreado;
import org.ejemplo.dojo.event.EstudianteEliminado;

import java.util.HashSet;

public class DojoChange extends EventChange {
    public DojoChange(Dojo dojo) {
        apply((DojoCreado event)-> {
            dojo.abierto = Boolean.FALSE;
            dojo.estudiantes = new HashSet<>();
            dojo.nombre = event.getNombre();
        });

        apply((DojoAbierto event)-> {
            dojo.abierto = Boolean.TRUE;
            dojo.estudiantes = new HashSet<>();
            dojo.nombre = event.getNombre();
        });

        apply((EstudianteCreado event)->{
            dojo.abierto = Boolean.TRUE;
            dojo.estudiantes = new HashSet<>();
            dojo.nombreEstudiante = event.getNombreEstudiante();
        });

        apply((EstudianteEliminado event)->{
            dojo.abierto = Boolean.TRUE;
            dojo.estudiantes= new HashSet<>();
            dojo.estudianteId = event.getEstudianteId();
        });
    }
}
