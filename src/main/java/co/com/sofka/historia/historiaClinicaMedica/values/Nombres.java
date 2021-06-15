package co.com.sofka.historia.historiaClinicaMedica.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Nombres implements ValueObject<String> {

    private final String value;

    public Nombres(String value) {
        this.value = Objects.requireNonNull(value);
        if (this.value.isBlank()){
            throw new IllegalArgumentException("el nombre no puede ser vacio");
        }
    }

    public String value() {
        return value;
    }
}
