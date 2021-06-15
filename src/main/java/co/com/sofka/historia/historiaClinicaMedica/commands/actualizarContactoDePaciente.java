package co.com.sofka.historia.historiaClinicaMedica.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.historia.historiaClinicaMedica.values.Contacto;
import co.com.sofka.historia.historiaClinicaMedica.values.IdentificacionPaciente;
import co.com.sofka.historia.historiaClinicaMedica.values.Ingreso;

public class actualizarContactoDePaciente implements Command {
    private final Ingreso ingreso;
    private final IdentificacionPaciente entityId;
    private final Contacto contacto;

    public actualizarContactoDePaciente(Ingreso ingreso, IdentificacionPaciente entityId, Contacto contacto) {
        this.ingreso = ingreso;
        this.entityId = entityId;
        this.contacto = contacto;
    }

    public Ingreso getIngreso() {
        return ingreso;
    }

    public IdentificacionPaciente getEntityId() {
        return entityId;
    }

    public Contacto getContacto() {
        return contacto;
    }
}
