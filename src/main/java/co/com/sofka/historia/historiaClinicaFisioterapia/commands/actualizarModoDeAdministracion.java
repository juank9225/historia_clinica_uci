package co.com.sofka.historia.historiaClinicaFisioterapia.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.historia.historiaClinicaFisioterapia.values.ModoAdministracion;
import co.com.sofka.historia.historiaClinicaFisioterapia.values.NumeroControlOxigeno;

public class actualizarModoDeAdministracion implements Command {
    private final NumeroControlOxigeno id;
    private final ModoAdministracion administracion;

    public actualizarModoDeAdministracion(NumeroControlOxigeno id, ModoAdministracion administracion) {
        this.id = id;
        this.administracion = administracion;
    }

    public NumeroControlOxigeno getId() {
        return id;
    }

    public ModoAdministracion getAdministracion() {
        return administracion;
    }
}
