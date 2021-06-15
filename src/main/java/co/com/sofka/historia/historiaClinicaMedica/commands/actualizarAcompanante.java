package co.com.sofka.historia.historiaClinicaMedica.commands;


import co.com.sofka.domain.generic.Command;
import co.com.sofka.historia.historiaClinicaMedica.values.Acompanante;
import co.com.sofka.historia.historiaClinicaMedica.values.IdentificacionPaciente;
import co.com.sofka.historia.historiaClinicaMedica.values.Ingreso;

public class actualizarAcompanante implements Command {

    private final Ingreso ingreso;
    private final IdentificacionPaciente identificacionPaciente;
    private final Acompanante acompanante;

    public actualizarAcompanante(Ingreso ingreso, IdentificacionPaciente identificacionPaciente, Acompanante acompanante) {
        this.ingreso = ingreso;
        this.identificacionPaciente = identificacionPaciente;
        this.acompanante = acompanante;
    }

    public Ingreso getIngreso() {
        return ingreso;
    }

    public IdentificacionPaciente getIdentificacionPaciente() {
        return identificacionPaciente;
    }

    public Acompanante getAcompanante() {
        return acompanante;
    }
}
