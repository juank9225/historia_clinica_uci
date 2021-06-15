package co.com.sofka.historia.historiaClinicaMedica.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.historia.historiaClinicaMedica.values.*;

public class PacienteAgregado extends DomainEvent {
    private final IdentificacionPaciente identificacionPaciente;
    private final Nombres nombres;
    private final Direccion direccion;
    private final Contacto contacto;
    private final Acompanante acompanante;

    public PacienteAgregado(IdentificacionPaciente identificacionPaciente, Nombres nombres, Direccion direccion, Contacto contacto, Acompanante acompanante) {
        super("softka.historiaclinicamedica.pacienteagregado");
        this.identificacionPaciente = identificacionPaciente;
        this.nombres = nombres;
        this.direccion = direccion;
        this.contacto = contacto;
        this.acompanante = acompanante;
    }

    public IdentificacionPaciente getIdentificacionPaciente() {
        return identificacionPaciente;
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

    public Acompanante getAcompanante() {
        return acompanante;
    }
}
