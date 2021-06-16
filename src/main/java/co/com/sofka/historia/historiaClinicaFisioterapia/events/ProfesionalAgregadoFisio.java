package co.com.sofka.historia.historiaClinicaFisioterapia.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.historia.historiaClinicaMedica.values.*;

public class ProfesionalAgregadoFisio extends DomainEvent {

    private final IdentificacionPersonalSalud identificacionPersonalSalud;
    private final Nombres nombres;
    private final Direccion direccion;
    private final Contacto contacto;
    private final Profesion profesion;

    public ProfesionalAgregadoFisio(IdentificacionPersonalSalud identificacionPersonalSalud,Nombres nombres,Direccion direccion,Contacto contacto,Profesion profesion) {
        super("softka.historiaclinicafisioterapia.profesionalagregadofisio");
        this.identificacionPersonalSalud = identificacionPersonalSalud;
        this.nombres = nombres;
        this.direccion = direccion;
        this.contacto = contacto;
        this.profesion = profesion;
    }


    public IdentificacionPersonalSalud getIdentificacionPersonalSalud() {
        return identificacionPersonalSalud;
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
