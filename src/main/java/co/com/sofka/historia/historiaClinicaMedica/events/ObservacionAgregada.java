package co.com.sofka.historia.historiaClinicaMedica.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.historia.historiaClinicaMedica.values.Observacion;

public class ObservacionAgregada extends DomainEvent {
    private final Observacion observacion;

    public ObservacionAgregada(Observacion observacion) {
        super("softka.historiaclinicamedica.observacionagregada");
        this.observacion = observacion;
    }

    public Observacion getObservacion() {
        return observacion;
    }
}
