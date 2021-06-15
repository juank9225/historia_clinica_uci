package co.com.sofka.historia.historiaClinicaMedica.values;

import co.com.sofka.domain.generic.Identity;

public class IdentificacionPersonalSalud extends Identity {

    public IdentificacionPersonalSalud(){

    }

    private IdentificacionPersonalSalud(String id){
        super(id);
    }

    public static IdentificacionPersonalSalud of(String id){
        return new IdentificacionPersonalSalud(id);
    }
}
