package co.com.sofka.historia.historiaClinicaMedica.values;

import co.com.sofka.domain.generic.Identity;
import co.com.sofka.historia.historiaClinicaFisioterapia.values.NumeroHistoria;

public class Ingreso extends Identity {

    public Ingreso(){

    }

    private Ingreso(String id){
        super(id);
    }

    public static Ingreso of(String id){
        return new Ingreso(id);
    }
}
