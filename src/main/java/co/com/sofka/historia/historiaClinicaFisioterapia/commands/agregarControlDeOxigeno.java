package co.com.sofka.historia.historiaClinicaFisioterapia.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.historia.historiaClinicaFisioterapia.values.*;
import co.com.sofka.historia.historiaClinicaMedica.values.Fecha;

public class agregarControlDeOxigeno implements Command {

    private final NumeroControlOxigeno entityId;
    private final Fecha fecha;
    private final InicioControlOxigeno inicio;
    private final TerminacionControlOxigeno terminacion;
    private final Suministro suministro;
    private final LitrosOxigeno litrosOxigeno;
    private final ModoAdministracion modoAdministracion;

    public agregarControlDeOxigeno(NumeroControlOxigeno entityId, Fecha fecha, InicioControlOxigeno inicio, TerminacionControlOxigeno terminacion, Suministro suministro, LitrosOxigeno litrosOxigeno, ModoAdministracion modoAdministracion) {
        this.entityId = entityId;
        this.fecha = fecha;
        this.inicio = inicio;
        this.terminacion = terminacion;
        this.suministro = suministro;
        this.litrosOxigeno = litrosOxigeno;
        this.modoAdministracion = modoAdministracion;
    }

    public NumeroControlOxigeno getEntityId() {
        return entityId;
    }

    public Fecha getFecha() {
        return fecha;
    }

    public InicioControlOxigeno getInicio() {
        return inicio;
    }

    public TerminacionControlOxigeno getTerminacion() {
        return terminacion;
    }

    public Suministro getSuministro() {
        return suministro;
    }

    public LitrosOxigeno getLitrosOxigeno() {
        return litrosOxigeno;
    }

    public ModoAdministracion getModoAdministracion() {
        return modoAdministracion;
    }
}
