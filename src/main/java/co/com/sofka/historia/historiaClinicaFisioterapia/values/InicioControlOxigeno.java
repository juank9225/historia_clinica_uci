package co.com.sofka.historia.historiaClinicaFisioterapia.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class InicioControlOxigeno implements ValueObject<String> {

    private final String value;

    public InicioControlOxigeno(String value) {
        this.value = Objects.requireNonNull(value);
        if (this.value.isBlank()){
            throw new IllegalArgumentException("el inicio de oxigeno no puede estar vacio");
        }
    }

    public String value() {
        return value;
    }
}
