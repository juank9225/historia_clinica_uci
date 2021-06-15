package co.com.sofka.historia.historiaClinicaMedica.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.historia.historiaClinicaMedica.values.Acompanante;
import co.com.sofka.historia.historiaClinicaMedica.values.IdentificacionPaciente;

public class acompananteActualizado extends DomainEvent {
    private final IdentificacionPaciente identificacionPaciente;
    private final Acompanante acompanante;
    public acompananteActualizado(IdentificacionPaciente identificacionPaciente,Acompanante acompanante) {
        super("softka.historiaclinicamedica.acompananteActualizado");
        this.identificacionPaciente = identificacionPaciente;
        this.acompanante = acompanante;
    }

    public IdentificacionPaciente getIdentificacionPaciente() {
        return identificacionPaciente;
    }

    public Acompanante getAcompanante() {
        return acompanante;
    }
}
