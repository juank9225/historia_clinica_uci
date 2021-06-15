package co.com.sofka.historia.historiaClinicaFisioterapia.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class SoporteVentilatorio implements ValueObject<String> {
    private final String value;

    public SoporteVentilatorio(String value) {
        this.value = Objects.requireNonNull(value);
        if (this.value.isBlank()){
            throw new IllegalArgumentException("el soporte ventilatorio del paciente no debe ser vacio");
        }
    }

    public String value() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SoporteVentilatorio that = (SoporteVentilatorio) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
