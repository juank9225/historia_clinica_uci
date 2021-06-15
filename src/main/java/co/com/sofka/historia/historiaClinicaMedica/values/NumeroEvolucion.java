package co.com.sofka.historia.historiaClinicaMedica.values;

import co.com.sofka.domain.generic.Identity;

public class NumeroEvolucion  extends Identity {

    public NumeroEvolucion(){

    }

    private NumeroEvolucion(String id){
        super(id);
    }

    public static NumeroEvolucion of(String id){
        return new NumeroEvolucion(id);
    }
}
