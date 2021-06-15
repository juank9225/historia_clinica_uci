package co.com.sofka.historia.historiaClinicaMedica;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.historia.historiaClinicaMedica.values.*;

import java.util.Objects;

public class ProfesionalSalud extends Entity<IdentificacionPersonalSalud> {
    private Nombres nombres;
    private Direccion direccion;
    private Contacto contacto;
    private Profesion profesion;

    public ProfesionalSalud(IdentificacionPersonalSalud entityId, Nombres nombres, Direccion direccion, Contacto contacto, Profesion profesion) {
        super(entityId);
        this.nombres = nombres;
        this.direccion = direccion;
        this.contacto = contacto;
        this.direccion = direccion;
    }

    public void actualizarNombreProfesional(Nombres nombres){
        this.nombres = Objects.requireNonNull(nombres);
    }

    public void actualizarDireccionProfesional(Direccion direccion){
        this.direccion = Objects.requireNonNull(direccion);
    }

    public void actualizarContactoProfesional(Contacto contacto){
        this.contacto = Objects.requireNonNull(contacto);
    }

    public Nombres Nombres() {
        return nombres;
    }

    public Direccion Direccion() {
        return direccion;
    }

    public Contacto Contacto() {
        return contacto;
    }

    public Profesion Profesion() {
        return profesion;
    }
}
