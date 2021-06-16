package co.com.sofka.historia.historiaClinicaFisioterapia.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.historia.historiaClinicaFisioterapia.values.ModoAdministracion;
import co.com.sofka.historia.historiaClinicaFisioterapia.values.NumeroControlOxigeno;

public class ModoDeAdministracionActualizado extends DomainEvent {
    private final NumeroControlOxigeno id;
    private final ModoAdministracion administracion;
    public ModoDeAdministracionActualizado(NumeroControlOxigeno id, ModoAdministracion administracion) {
        super("softka.historiaclinicafisioterapia.administracionactualizada");
        this.id = id;
        this.administracion = administracion;
    }

    public ModoAdministracion getAdministracion() {
        return administracion;
    }

    public NumeroControlOxigeno getId() {
        return id;
    }
}
