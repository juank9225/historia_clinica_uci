package co.com.sofka.historia.historiaClinicaMedica.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.historia.historiaClinicaMedica.values.Direccion;
import co.com.sofka.historia.historiaClinicaMedica.values.IdentificacionPaciente;

public class DireccionDePacienteActualizado extends DomainEvent {
    private final IdentificacionPaciente identificacionPaciente;
    private final Direccion direccion;

    public DireccionDePacienteActualizado(IdentificacionPaciente identificacionPaciente,Direccion direccion) {
        super("softka.historiaclinicamedica.DireccionDePacienteActualizado");
        this.identificacionPaciente = identificacionPaciente;
        this.direccion = direccion;
    }

    public IdentificacionPaciente getIdentificacionPaciente() {
        return identificacionPaciente;
    }

    public Direccion getDireccion() {
        return direccion;
    }
}
