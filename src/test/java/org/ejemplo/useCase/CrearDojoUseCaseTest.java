package org.ejemplo.useCase;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import org.ejemplo.dojo.command.CrearDojoCommand;
import org.ejemplo.dojo.event.DojoAbierto;
import org.ejemplo.dojo.event.DojoCreado;
import org.ejemplo.dojo.implement.Nombre;
import org.ejemplo.useCase.CrearDojoUseCase;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


import java.util.Objects;

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

        System.out.println(dojoCreado.getNombre());
        System.out.println(dojoAbierto.aggregateRootId());

        Assertions.assertTrue( Objects.nonNull(dojoCreado.getNombre().value()));
        Assertions.assertTrue( Objects.nonNull(dojoAbierto.aggregateRootId()));
    }
}