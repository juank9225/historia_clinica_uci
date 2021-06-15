package co.com.sofka.historia.historiaClinicaMedica.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.historia.historiaClinicaMedica.values.Direccion;
import co.com.sofka.historia.historiaClinicaMedica.values.IdentificacionPaciente;
import co.com.sofka.historia.historiaClinicaMedica.values.Ingreso;

public class actualizarDireccionDePaciente implements Command {
    private final Ingreso ingreso;
    private final IdentificacionPaciente entityId;
    private final Direccion direccion;

    public actualizarDireccionDePaciente(Ingreso ingreso, IdentificacionPaciente entityId, Direccion direccion) {
        this.ingreso = ingreso;
        this.entityId = entityId;
        this.direccion = direccion;
    }

    public Ingreso getIngreso() {
        return ingreso;
    }

    public IdentificacionPaciente getEntityId() {
        return entityId;
    }

    public Direccion getDireccion() {
        return direccion;
    }
}
