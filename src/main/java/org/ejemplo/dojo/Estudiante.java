package org.ejemplo.dojo;


import co.com.sofka.domain.generic.Entity;

public class Estudiante extends Entity<EstudianteId> {
    private final Nombre nombre;
    private  Calificacion calificacion;


    public Estudiante(EstudianteId estudianteId, Nombre nombre) {
        super(estudianteId);
        this.nombre = nombre;
    }

    public void cambiarCalifiacion(Calificacion calificacion){
        //TODO: agregar validaciones
        this.calificacion = calificacion;
    }

    public Calificacion calificacion() {
        return calificacion;
    }

    public Nombre nombre() {
        return nombre;
    }
}
