package co.com.sofka.historia.historiaClinicaMedica.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Estado implements ValueObject<String> {

    private final String value;

    public Estado(String value) {
        this.value = Objects.requireNonNull(value);
        if (this.value.isBlank()){
            throw new IllegalArgumentException("el estado del paciente no puede ser vacio");
        }
    }

    public String value() {
        return value;
    }
}
