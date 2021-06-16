package co.com.sofka.historia.historiaClinicaFisioterapia.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.historia.historiaClinicaMedica.values.Ingreso;

public class asociarIngreso implements Command {
    private final Ingreso ingreso;

    public asociarIngreso(Ingreso ingreso) {
        this.ingreso = ingreso;
    }

    public Ingreso getIngreso() {
        return ingreso;
    }
}
