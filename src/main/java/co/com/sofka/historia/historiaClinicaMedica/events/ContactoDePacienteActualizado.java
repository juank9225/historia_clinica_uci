package co.com.sofka.historia.historiaClinicaMedica.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.historia.historiaClinicaMedica.values.Contacto;
import co.com.sofka.historia.historiaClinicaMedica.values.IdentificacionPaciente;

public class ContactoDePacienteActualizado extends DomainEvent {
    private final IdentificacionPaciente identificacionPaciente;
    private final Contacto contacto;

    public ContactoDePacienteActualizado(IdentificacionPaciente identificacionPaciente, Contacto contacto) {
        super("softka.historiaclinicamedica.ContactoDePacienteActualizado");
        this.identificacionPaciente = identificacionPaciente;
        this.contacto = contacto;
    }

    public IdentificacionPaciente getIdentificacionPaciente() {
        return identificacionPaciente;
    }

    public Contacto getContacto() {
        return contacto;
    }
}
