package co.com.sofka.historia.historiaClinicaFisioterapia.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class TerminacionControlOxigeno implements ValueObject<String> {

    private final String value;

    public TerminacionControlOxigeno(String value) {
        this.value = Objects.requireNonNull(value);
        if (this.value.isBlank()){
            throw new IllegalArgumentException("el campo terminacion de oxigeno no puede estar vacio");
        }
    }

    public String value() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TerminacionControlOxigeno that = (TerminacionControlOxigeno) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
