package co.com.sofka.historia.historiaClinicaMedica.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Acompanante implements ValueObject<String> {

    private final String value;

    public Acompanante(String value) {
        this.value = Objects.requireNonNull(value);
        if(this.value.isBlank()){
            throw new IllegalArgumentException("el paciente no se puede registrar sin acompañante");
        }
    }

    public String value() {
        return value;
    }
}
