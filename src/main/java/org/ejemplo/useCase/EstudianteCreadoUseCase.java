package org.ejemplo.useCase;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import org.ejemplo.dojo.Dojo;
import org.ejemplo.dojo.command.CrearEstudianCommand;
import org.ejemplo.dojo.value.EstudianteId;

public class EstudianteCreadoUseCase extends UseCase<RequestCommand<CrearEstudianCommand>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<CrearEstudianCommand> input) {
        var command = input.getCommand();
        var estudianteId = new EstudianteId();
        var dojo = Dojo.from(command.getDojoId(), retrieveEvents());

        dojo.agregarEstudiante(estudianteId);

        emit().onResponse(new ResponseEvents(dojo.getUncommittedChanges()));
    }
}
