package co.com.sofka.historia.historiaClinicaFisioterapia.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.historia.historiaClinicaFisioterapia.values.Posicion;
import co.com.sofka.historia.historiaClinicaMedica.values.Diagnostico;

public class HistoriaDeFisioterapiaCreada extends DomainEvent {
    private final Posicion posicion;

    public HistoriaDeFisioterapiaCreada(Posicion posicion) {
        super("softka.historiaclinicafisioterapia.historiadefisioterapiacreada");
        this.posicion = posicion;
    }

    public Posicion getPosicion() {
        return posicion;
    }
}
