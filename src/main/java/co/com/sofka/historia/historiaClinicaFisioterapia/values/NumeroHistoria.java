package co.com.sofka.historia.historiaClinicaFisioterapia.values;

import co.com.sofka.domain.generic.Identity;

public class NumeroHistoria extends Identity {

    public NumeroHistoria(){

    }

    private NumeroHistoria(String id){
        super(id);
    }

    public static NumeroHistoria of(String id){
        return new NumeroHistoria(id);
    }
}
