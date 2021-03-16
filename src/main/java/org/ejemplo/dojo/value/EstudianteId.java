package org.ejemplo.dojo.value;

import co.com.sofka.domain.generic.Identity;

public class EstudianteId extends Identity {
    public EstudianteId(String uId) {
        super(uId);
    }

    public EstudianteId() {
    }

    public static EstudianteId of(String  uId) {
        return new EstudianteId(uId);
    }

}
