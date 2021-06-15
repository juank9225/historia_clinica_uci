package co.com.sofka.historia.historiaClinicaFisioterapia.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class LitrosOxigeno implements ValueObject<String> {

    private final String value;

    public LitrosOxigeno(String value) {
        this.value = Objects.requireNonNull(value);
        if (this.value.isBlank()){
            throw new IllegalArgumentException("los litros de oxigeno no pueden ser vacios");
        }
    }

    public String value() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LitrosOxigeno that = (LitrosOxigeno) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
