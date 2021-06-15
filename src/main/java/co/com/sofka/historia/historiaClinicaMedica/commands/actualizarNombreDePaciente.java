package co.com.sofka.historia.historiaClinicaMedica.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.historia.historiaClinicaMedica.values.IdentificacionPaciente;
import co.com.sofka.historia.historiaClinicaMedica.values.Ingreso;
import co.com.sofka.historia.historiaClinicaMedica.values.Nombres;

public class actualizarNombreDePaciente implements Command {
    private final Ingreso ingreso;
    private final IdentificacionPaciente entityId;
    private final Nombres nombres;

    public actualizarNombreDePaciente(Ingreso ingreso, IdentificacionPaciente entityId, Nombres nombres) {
        this.ingreso = ingreso;
        this.entityId = entityId;
        this.nombres = nombres;
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
}
