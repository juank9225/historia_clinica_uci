package co.com.sofka.historia.historiaClinicaMedica.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Direccion implements ValueObject<String> {

    private final String value;

    public Direccion(String value) {
        this.value = Objects.requireNonNull(value);
        if (this.value.isBlank()){
            throw new IllegalArgumentException("la direccion no puede ser vacia");
        }
    }

    public String value() {
        return value;
    }
}
