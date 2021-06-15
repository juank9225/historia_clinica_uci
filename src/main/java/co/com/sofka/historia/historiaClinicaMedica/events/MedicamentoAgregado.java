package co.com.sofka.historia.historiaClinicaMedica.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.historia.historiaClinicaMedica.values.Medicamento;

public class MedicamentoAgregado extends DomainEvent {
    private final Medicamento medicamento;

    public MedicamentoAgregado(Medicamento medicamento) {
        super("softka.historiaclinicamedica.medicamentoagregado");
        this.medicamento = medicamento;
    }

    public Medicamento getMedicamento() {
        return medicamento;
    }
}
