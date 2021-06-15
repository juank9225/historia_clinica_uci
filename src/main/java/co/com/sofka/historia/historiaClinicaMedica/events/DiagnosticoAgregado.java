package co.com.sofka.historia.historiaClinicaMedica.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.historia.historiaClinicaMedica.values.Diagnostico;

public class DiagnosticoAgregado extends DomainEvent {
    private final Diagnostico diagnostico;

    public DiagnosticoAgregado(Diagnostico diagnostico) {
        super("softka.historiaclinicamedica.diagnosticoagregado");
        this.diagnostico = diagnostico;
    }

    public Diagnostico getDiagnostico() {
        return diagnostico;
    }
}
