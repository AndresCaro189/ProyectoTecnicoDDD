package org.ejemplo.dojo.implement;

import co.com.sofka.business.generic.BusinessException;
import co.com.sofka.domain.generic.ValueObject;

public class Calificacion implements ValueObject<Integer> {
    private final Integer value;

    public Calificacion(Integer value) {
        if (value <= 0){
            throw new BusinessException("1","No se puede ser menor a 0");
        }
        if ( value >= 0|| value<=3){
            System.out.println("Persona se pierde");
        }
        if (value == 4){
            System.out.println("Estudiantes Paso");
        }
        if(value == 5){
           System.out.println("Estudiante es el mejor");
        }
        this.value = value;
    }

    @Override
    public Integer value() {
        return value;
    }
}
