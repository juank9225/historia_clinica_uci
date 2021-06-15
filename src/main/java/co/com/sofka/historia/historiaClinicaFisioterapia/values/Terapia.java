package co.com.sofka.historia.historiaClinicaFisioterapia.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Terapia implements ValueObject<String> {

    private final String value;

    public Terapia(String value) {
        this.value = Objects.requireNonNull(value);
        if (this.value.isBlank()){
            throw new IllegalArgumentException("la terapia no debe estar vacia");
        }
    }

    public String value() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Terapia terapia = (Terapia) o;
        return Objects.equals(value, terapia.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
