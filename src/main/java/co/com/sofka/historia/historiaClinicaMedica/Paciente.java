package co.com.sofka.historia.historiaClinicaMedica;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.historia.historiaClinicaMedica.values.*;

import java.util.Objects;

public class Paciente extends Entity<IdentificacionPaciente> {
    private Nombres nombres;
    private Direccion direccion;
    private Contacto contacto;
    private Acompanante acompanante;

    public Paciente(IdentificacionPaciente entityId,Nombres nombres,Direccion direccion,Contacto contacto,Acompanante acompanante) {
        super(entityId);
        this.nombres = nombres;
        this.direccion = direccion;
        this.contacto = contacto;
        this.acompanante = acompanante;
    }

    public void actualizarNombres(Nombres nombres){
        this.nombres = Objects.requireNonNull(nombres);
    }

    public void actualizarDireccion(Direccion direccion){
        this.direccion = Objects.requireNonNull(direccion);
    }

    public void actualizarContacto(Contacto contacto){
        this.contacto = Objects.requireNonNull(contacto);
    }

    public void actualizarAcompanante(Acompanante acompanante){
        this.acompanante = Objects.requireNonNull(acompanante);
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
