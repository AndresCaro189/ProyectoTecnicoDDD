package org.ejemplo.dojo;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Nombre  implements ValueObject<String> {
    private final String value;

    public Nombre(String value) {
        this.value = Objects.requireNonNull(value);
    }

    @Override
    public String value() {
        return value;
    }
}
