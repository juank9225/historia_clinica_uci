package co.com.sofka.historia.historiaClinicaMedica.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Date;
import java.util.Objects;

public class Fecha implements ValueObject<Date> {

    private final Date value;

    public Fecha(Date value) {
        this.value = Objects.requireNonNull(value);
    }

    public Date value() {
        return value;
    }
}
