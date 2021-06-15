package co.com.sofka.historia.historiaClinicaMedica.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.historia.historiaClinicaMedica.values.Estado;
import co.com.sofka.historia.historiaClinicaMedica.values.Fecha;
import co.com.sofka.historia.historiaClinicaMedica.values.Ingreso;
import co.com.sofka.historia.historiaClinicaMedica.values.NumeroEvolucion;

public class agregarEvolucion implements Command {
    private final Ingreso ingreso;
    private final NumeroEvolucion entityId;
    private final Fecha fecha;
    private final Estado estado;

    public agregarEvolucion(Ingreso ingreso, NumeroEvolucion entityId, Fecha fecha, Estado estado) {
        this.ingreso = ingreso;
        this.entityId = entityId;
        this.fecha = fecha;
        this.estado = estado;
    }

    public Ingreso getIngreso() {
        return ingreso;
    }

    public NumeroEvolucion getEntityId() {
        return entityId;
    }

    public Fecha getFecha() {
        return fecha;
    }

    public Estado getEstado() {
        return estado;
    }
}
