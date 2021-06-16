package co.com.sofka.historia.historiaClinicaFisioterapia.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.historia.historiaClinicaFisioterapia.values.*;
import co.com.sofka.historia.historiaClinicaMedica.values.Fecha;

public class ControlDeOxigenoAgregado extends DomainEvent {

    private final NumeroControlOxigeno id;
    private final Fecha fecha;
    private final InicioControlOxigeno inicio;
    private final TerminacionControlOxigeno terminacion;
    private final Suministro suministro;
    private final LitrosOxigeno litrosOxigeno;
    private final ModoAdministracion modoAdministracion;

    public ControlDeOxigenoAgregado(NumeroControlOxigeno entityId, Fecha fecha, InicioControlOxigeno inicio, TerminacionControlOxigeno terminacion, Suministro suministro, LitrosOxigeno litrosOxigeno, ModoAdministracion modoAdministracion) {

            super("softka.historiaclinicafisioterapia.controldeoxigenoagregado");
            this.id = entityId;
            this.fecha = fecha;
            this.inicio = inicio;
            this.terminacion = terminacion;
            this.suministro = suministro;
            this.litrosOxigeno = litrosOxigeno;
            this.modoAdministracion = modoAdministracion;


    }

    public NumeroControlOxigeno getId() {
        return id;
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
