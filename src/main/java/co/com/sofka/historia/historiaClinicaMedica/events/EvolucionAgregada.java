package co.com.sofka.historia.historiaClinicaMedica.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.historia.historiaClinicaMedica.values.Estado;
import co.com.sofka.historia.historiaClinicaMedica.values.Fecha;
import co.com.sofka.historia.historiaClinicaMedica.values.NumeroEvolucion;

public class EvolucionAgregada extends DomainEvent {
    private final NumeroEvolucion numeroEvolucion;
    private final Fecha fecha;
    private final Estado estado;

    public EvolucionAgregada(NumeroEvolucion numeroEvolucion, Fecha fecha, Estado estado) {
        super("softka.historiaclinicamedica.evolucionagregada");
        this.numeroEvolucion = numeroEvolucion;
        this.fecha = fecha;
        this.estado = estado;
    }

    public NumeroEvolucion getNumeroEvolucion() {
        return numeroEvolucion;
    }

    public Fecha getFecha() {
        return fecha;
    }

    public Estado getEstado() {
        return estado;
    }
}
