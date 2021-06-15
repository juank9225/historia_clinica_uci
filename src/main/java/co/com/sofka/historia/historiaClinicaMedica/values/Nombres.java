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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Nombres nombres = (Nombres) o;
        return Objects.equals(value, nombres.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
