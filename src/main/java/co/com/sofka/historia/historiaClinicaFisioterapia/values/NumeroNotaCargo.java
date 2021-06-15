package co.com.sofka.historia.historiaClinicaFisioterapia.values;

import co.com.sofka.domain.generic.Identity;

public class NumeroNotaCargo extends Identity {

    public NumeroNotaCargo(){

    }

    private NumeroNotaCargo(String id){
        super(id);
    }

    public static NumeroNotaCargo of(String id){
        return new NumeroNotaCargo(id);
    }
}
