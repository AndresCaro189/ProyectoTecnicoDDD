package org.ejemplo.useCase;

        import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import org.ejemplo.dojo.command.EliminarEstudianteCommand;

public class EstudianteEliminadoUseCase extends UseCase<RequestCommand<EliminarEstudianteCommand>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<EliminarEstudianteCommand> eliminarEstudianteCommandRequestCommand) {

    }
}
