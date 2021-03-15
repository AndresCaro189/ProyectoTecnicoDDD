package org.ejemplo.dojo;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;

public class CrearDojoUseCase extends UseCase<RequestCommand<CrearDojoCommand>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<CrearDojoCommand> crearDojoCommandRequestCommand) {
        var command = crearDojoCommandRequestCommand.getCommand();
        var dojo =  new Dojo(new DojoId(), command.getNombre());
        dojo.abrirElDojo();
        emit().onResponse(new ResponseEvents(dojo.getUncommittedChanges()));
    }
}
