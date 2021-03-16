package org.ejemplo.dojo.entity;


import co.com.sofka.domain.generic.Entity;
import org.ejemplo.dojo.implement.Calificacion;
import org.ejemplo.dojo.implement.NombreEstudiante;
import org.ejemplo.dojo.value.EstudianteId;


public class Estudiante extends Entity<EstudianteId> {
    private final NombreEstudiante nombreEstudiante;
    private Calificacion calificacion;


    public Estudiante(EstudianteId estudianteId, NombreEstudiante nombreEstudiante) {
        super(estudianteId);
        this.nombreEstudiante = nombreEstudiante;
    }

    public void cambiarCalifiacion(Calificacion calificacion){
        //TODO: agregar validaciones
        this.calificacion = calificacion;
    }

    public Calificacion calificacion() {
        return calificacion;
    }

    public NombreEstudiante getNombreEstudiante() {
        return nombreEstudiante;
    }
}
