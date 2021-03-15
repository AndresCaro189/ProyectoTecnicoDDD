package org.ejemplo.dojo;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.generic.DomainEvent;
import org.junit.jupiter.api.Test;

import java.util.concurrent.Flow;

import static org.junit.jupiter.api.Assertions.*;

class CrearDojoUseCaseTest {

    @Test
    public void crearDojo()  {
        var command = new CrearDojoCommand(new Nombre("Dojo de java"));
        var useCase = new CrearDojoUseCase();

       var events =  UseCaseHandler.getInstance()
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();

        //TODO: verificar los eventos de retorno
        var dojoCreado = (DojoCreado)events.get(0);
        var dojoAbierto = (DojoAbierto)events.get(1);
    }
}