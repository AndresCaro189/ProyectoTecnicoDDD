package org.ejemplo.dojo;

import co.com.sofka.domain.annotation.Aggregate;
import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;

import java.util.List;
import java.util.Set;

public class Dojo extends AggregateEvent<DojoId> {
    protected Set<Estudiante> estudiantes;
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


    public void agregarEstudiante(Nombre nombre){
        var estudianteId = new EstudianteId();
        //TODO: crear el evento y modificar los cambios de estado (DojoChange) agregar la nueva entidad
    }

    public void eliminarEstudiante(EstudianteId estudianteId){

    }

    public void actualizarEstudiante(EstudianteId estudianteId, Nombre nombre){

    }

    public void cambiarCalificacionDeEstudiante(EstudianteId estudianteId, Calificacion calificacion){

    }

    public void abrirElDojo(){
        appendChange(new DojoAbierto()).apply();
    }
}
