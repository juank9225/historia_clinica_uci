package co.com.sofka.historia.historiaClinicaMedica.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.historia.historiaClinicaMedica.values.*;

public class agregarPaciente implements Command {
    private final Ingreso ingreso;
    private final IdentificacionPaciente entityId;
    private final Nombres nombres;
    private final Direccion direccion;
    private final Contacto contacto;
    private final Acompanante acompanant;

    public agregarPaciente(Ingreso ingreso, IdentificacionPaciente entityId, Nombres nombres, Direccion direccion, Contacto contacto, Acompanante acompanant) {
        this.ingreso = ingreso;
        this.entityId = entityId;
        this.nombres = nombres;
        this.direccion = direccion;
        this.contacto = contacto;
        this.acompanant = acompanant;
    }

    public Ingreso getIngreso() {
        return ingreso;
    }

    public IdentificacionPaciente getEntityId() {
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

    public Acompanante getAcompanant() {
        return acompanant;
    }
}
