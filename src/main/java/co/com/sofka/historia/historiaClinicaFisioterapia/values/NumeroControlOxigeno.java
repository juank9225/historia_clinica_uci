package co.com.sofka.historia.historiaClinicaFisioterapia.values;

import co.com.sofka.domain.generic.Identity;

public class NumeroControlOxigeno extends Identity {

    public NumeroControlOxigeno(){

    }

    private NumeroControlOxigeno(String id){
        super(id);
    }

    public static NumeroControlOxigeno of(String id){
        return new NumeroControlOxigeno(id);
    }
}
