package org.ejemplo.dojo.entity;

import co.com.sofka.domain.generic.Entity;
import org.ejemplo.dojo.implement.NombreSensei;
import org.ejemplo.dojo.value.SenseiId;

public class Sensei extends Entity<SenseiId> {
    private final NombreSensei nombreSensei;

    public Sensei(SenseiId entityId, NombreSensei nombreSensei) {
        super(entityId);
        this.nombreSensei = nombreSensei;
    }


}
