package co.com.sofka.historia.historiaClinicaMedica.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Observacion implements ValueObject<String> {

    private final String value;

    public Observacion(String value) {
        this.value = Objects.requireNonNull(value);
        if (this.value.isBlank()){
            throw new IllegalArgumentException("la observacion no puede ser vacia");
        }
    }

    public String value() {
        return value;
    }
}
