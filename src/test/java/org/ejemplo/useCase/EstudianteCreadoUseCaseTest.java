package org.ejemplo.useCase;

import org.ejemplo.dojo.command.CrearEstudianteCommand;
import org.ejemplo.dojo.implement.NombreEstudiante;
import org.ejemplo.dojo.value.DojoId;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class EstudianteCreadoUseCaseTest {

    @Test
    void EstudianteCreado () {
        var dojoId = new DojoId();

        var estudianteCreado = new CrearEstudianteCommand(dojoId, new NombreEstudiante("Andres Caro"));

        Assertions.assertEquals("Andres Caro" , estudianteCreado.getNombreEstudiante().value());
    }
}