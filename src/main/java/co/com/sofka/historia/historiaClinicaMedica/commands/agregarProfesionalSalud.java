package co.com.sofka.historia.historiaClinicaMedica.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.historia.historiaClinicaMedica.values.*;

public class agregarProfesionalSalud  implements Command {
    private final Ingreso ingreso;
    private final IdentificacionPersonalSalud entityId;
    private final Nombres nombres;
    private final Direccion direccion;
    private final Contacto contacto;
    private final Profesion profesion;

    public agregarProfesionalSalud(Ingreso ingreso, IdentificacionPersonalSalud entityId, Nombres nombres, Direccion direccion, Contacto contacto, Profesion profesion) {
        this.ingreso = ingreso;
        this.entityId = entityId;
        this.nombres = nombres;
        this.direccion = direccion;
        this.contacto = contacto;
        this.profesion = profesion;
    }

    public Ingreso getIngreso() {
        return ingreso;
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

