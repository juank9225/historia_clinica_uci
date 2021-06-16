package co.com.sofka.historia.historiaClinicaFisioterapia;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.historia.historiaClinicaFisioterapia.values.*;
import co.com.sofka.historia.historiaClinicaMedica.values.Fecha;

import java.util.Objects;

public class ControlDeOxigeno extends Entity<NumeroControlOxigeno> {

    private Fecha fecha;
    private InicioControlOxigeno inicioControlOxigeno;
    private TerminacionControlOxigeno terminacionControlOxigeno;
    private Suministro suministro;
    private LitrosOxigeno litrosOxigeno;
    private ModoAdministracion modoAdministracion;

    public ControlDeOxigeno(NumeroControlOxigeno entityId, Fecha fecha, InicioControlOxigeno inicioControlOxigeno, TerminacionControlOxigeno terminacionControlOxigeno, Suministro suministro, LitrosOxigeno litrosOxigeno, ModoAdministracion modoAdministracion) {
        super(entityId);
        this.fecha = fecha;
        this.inicioControlOxigeno = inicioControlOxigeno;
        this.terminacionControlOxigeno = terminacionControlOxigeno;
        this.suministro = suministro;
        this.litrosOxigeno = litrosOxigeno;
        this.modoAdministracion = modoAdministracion;
    }

    public void actualizarSuministro(Suministro suministro){
        this.suministro = Objects.requireNonNull(suministro);
    }

    public void actualizarLitrosDeOxigeno(LitrosOxigeno litrosOxigeno){
        this.litrosOxigeno = Objects.requireNonNull(litrosOxigeno);
    }

    public void actualizarModoAdministracion(ModoAdministracion modoAdministracion){
        this.modoAdministracion = Objects.requireNonNull(modoAdministracion);
    }

    public Fecha Fecha() {
        return fecha;
    }

    public InicioControlOxigeno tInicioControlOxigeno() {
        return inicioControlOxigeno;
    }

    public TerminacionControlOxigeno TerminacionControlOxigeno() {
        return terminacionControlOxigeno;
    }

    public Suministro Suministro() {
        return suministro;
    }

    public LitrosOxigeno LitrosOxigeno() {
        return litrosOxigeno;
    }

    public ModoAdministracion ModoAdministracion() {
        return modoAdministracion;
    }
}
