package co.com.sofka.historia.historiaClinicaMedica.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Contacto implements ValueObject<String> {

    private final String value;

    public Contacto(String value) {
        this.value = Objects.requireNonNull(value);
        if(this.value.isBlank()){
            throw new IllegalArgumentException("el numero de contacto no puede estar vacio");
        }
        if (this.value.length() > 10){
            throw new IllegalArgumentException("el numero de contacto no es correcto");
        }
    }

    public String value() {
        return value;
    }
}
