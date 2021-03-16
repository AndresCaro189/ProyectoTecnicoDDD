package org.ejemplo.useCase;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import org.ejemplo.dojo.command.CrearDojoCommand;
import org.ejemplo.dojo.Dojo;
import org.ejemplo.dojo.value.DojoId;

public class CrearDojoUseCase extends UseCase<RequestCommand<CrearDojoCommand>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<CrearDojoCommand> input) {
        var command = input.getCommand();
        var dojo =  new Dojo(new DojoId(), command.getNombre());

        dojo.abrirElDojo();

        emit().onResponse(new ResponseEvents(dojo.getUncommittedChanges()));
    }
}
