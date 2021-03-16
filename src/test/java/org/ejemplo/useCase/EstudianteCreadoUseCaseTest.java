package org.ejemplo.useCase;

import org.ejemplo.dojo.command.CrearEstudianCommand;
import org.ejemplo.dojo.implement.NombreEstudiante;
import org.ejemplo.dojo.value.DojoId;
import org.ejemplo.dojo.value.EstudianteId;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;



class EstudianteCreadoUseCaseTest {

    @Test
    void EstudianteCreado () {
        var dojoId = new DojoId();

        var command = new CrearEstudianCommand(dojoId, new NombreEstudiante("Andres Caro"));

        Assertions.assertEquals("Andres Caro" );
    }
}