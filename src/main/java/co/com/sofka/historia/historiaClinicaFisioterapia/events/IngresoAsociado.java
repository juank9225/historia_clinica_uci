package co.com.sofka.historia.historiaClinicaFisioterapia.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.historia.historiaClinicaMedica.values.Ingreso;

public class IngresoAsociado extends DomainEvent {

    private final Ingreso ingreso;
    public IngresoAsociado(Ingreso ingreso) {
        super("softka.historiaclinicafisioterapia.historiadefisioterapiacreada");
        this.ingreso = ingreso;
    }

    public Ingreso getIngreso() {
        return ingreso;
    }
}
