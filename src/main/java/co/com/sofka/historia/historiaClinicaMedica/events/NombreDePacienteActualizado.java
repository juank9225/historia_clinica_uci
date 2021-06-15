package co.com.sofka.historia.historiaClinicaMedica.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.historia.historiaClinicaMedica.values.IdentificacionPaciente;
import co.com.sofka.historia.historiaClinicaMedica.values.Nombres;

public class NombreDePacienteActualizado extends DomainEvent {
    private final IdentificacionPaciente identificacionPaciente;
    private final Nombres nombres;

    public NombreDePacienteActualizado(IdentificacionPaciente identificacionPaciente,Nombres nombres) {
        super("softka.historiaclinicamedica.nombredepacienteactualizado");
        this.identificacionPaciente = identificacionPaciente;
        this.nombres = nombres;
    }

    public IdentificacionPaciente getIdentificacionPaciente() {
        return identificacionPaciente;
    }

    public Nombres getNombres() {
        return nombres;
    }
}
