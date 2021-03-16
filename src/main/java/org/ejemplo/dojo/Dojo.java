package org.ejemplo.dojo;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import org.ejemplo.dojo.entity.Estudiante;
import org.ejemplo.dojo.event.DojoAbierto;
import org.ejemplo.dojo.event.DojoCreado;
import org.ejemplo.dojo.event.EstudianteCreado;
import org.ejemplo.dojo.implement.Calificacion;
import org.ejemplo.dojo.implement.NombreEstudiante;
import org.ejemplo.dojo.value.DojoId;
import org.ejemplo.dojo.value.EstudianteId;
import org.ejemplo.dojo.implement.Nombre;

import java.util.List;
import java.util.Set;

public class Dojo extends AggregateEvent<DojoId> {
    protected Set<Estudiante> estudiantes;
    protected NombreEstudiante nombreEstudiante;
    protected Nombre nombre;
    protected Boolean abierto;

    public Dojo(DojoId entityId, Nombre nombre) {
        super(entityId);
        appendChange(new DojoCreado(nombre)).apply();
    }

    private Dojo(DojoId entityId){
        super(entityId);
        subscribe(new DojoChange(this));
    }


    public static Dojo from(DojoId dojoId, List<DomainEvent> events){
        var dojo = new Dojo(dojoId);
        events.forEach(dojo::applyEvent);
        return dojo;
    }


    public void agregarEstudiante(EstudianteId estudianteId){
        appendChange(new EstudianteCreado(nombreEstudiante));
    }

    public void eliminarEstudiante(EstudianteId estudianteId){

    }

    public void actualizarEstudiante(EstudianteId estudianteId, Nombre nombre){

    }

    public void cambiarCalificacionDeEstudiante(EstudianteId estudianteId, Calificacion calificacion){

    }

    public void abrirElDojo(){
        appendChange(new DojoAbierto(nombre)).apply();
    }
}
