package co.com.sofka.historia.historiaClinicaMedica;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.historia.historiaClinicaMedica.values.Estado;
import co.com.sofka.historia.historiaClinicaMedica.values.Fecha;
import co.com.sofka.historia.historiaClinicaMedica.values.NumeroEvolucion;

import java.util.Objects;

public class Evolucion extends Entity<NumeroEvolucion> {
    private Fecha fecha;
    private Estado estado;

    public Evolucion(NumeroEvolucion entityId, Fecha fecha, Estado estado) {
        super(entityId);
        this.fecha = fecha;
        this.estado = estado;
    }

    public void actualizarEstado(Estado estado){
        this.estado = Objects.requireNonNull(estado);
    }

    public void actualizarFechaEvolucion(Fecha fecha){
        this.fecha = Objects.requireNonNull(fecha);
    }

    public Fecha Fecha() {
        return fecha;
    }

    public Estado Estado() {
        return estado;
    }
}
