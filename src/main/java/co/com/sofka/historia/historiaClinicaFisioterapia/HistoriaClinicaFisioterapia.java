package co.com.sofka.historia.historiaClinicaFisioterapia;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.historia.historiaClinicaFisioterapia.values.NumeroHistoria;

public class HistoriaClinicaFisioterapia extends AggregateEvent<NumeroHistoria> {

    public HistoriaClinicaFisioterapia(NumeroHistoria entityId) {
        super(entityId);
    }
}
