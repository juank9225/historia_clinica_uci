package co.com.sofka.historia.historiaClinicaFisioterapia.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.historia.historiaClinicaMedica.values.*;

public class agregarProfesionalSaludFisio implements Command {

    private final IdentificacionPersonalSalud entityId;
    private final Nombres nombres;
    private final Direccion direccion;
    private final Contacto contacto;
    private final Profesion profesion;

    public agregarProfesionalSaludFisio(IdentificacionPersonalSalud entityId, Nombres nombres, Direccion direccion, Contacto contacto, Profesion profesion) {
        this.entityId = entityId;
        this.nombres = nombres;
        this.direccion = direccion;
        this.contacto = contacto;
        this.profesion = profesion;
    }

    public IdentificacionPersonalSalud getEntityId() {
        return entityId;
    }

    public Nombres getNombres() {
        return nombres;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public Contacto getContacto() {
        return contacto;
    }

    public Profesion getProfesion() {
        return profesion;
    }
}
