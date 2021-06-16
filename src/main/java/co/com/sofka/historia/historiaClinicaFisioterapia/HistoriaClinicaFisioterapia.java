package co.com.sofka.historia.historiaClinicaFisioterapia;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.historia.historiaClinicaFisioterapia.events.*;
import co.com.sofka.historia.historiaClinicaFisioterapia.values.*;
import co.com.sofka.historia.historiaClinicaMedica.HistoriaClinicaMedica;
import co.com.sofka.historia.historiaClinicaMedica.HistoriaClinicaMedicaChange;
import co.com.sofka.historia.historiaClinicaMedica.Paciente;
import co.com.sofka.historia.historiaClinicaMedica.events.ProfesionalAgregado;
import co.com.sofka.historia.historiaClinicaMedica.values.*;

import java.util.List;
import java.util.Objects;
import java.util.Set;

public class HistoriaClinicaFisioterapia extends AggregateEvent<NumeroHistoria> {

    protected Posicion posicion;
    protected Ingreso ingreso;
    protected Set<ControlDeOxigeno> controlDeOxigenos;
    protected Set<NotaDeCargo> notaDeCargos;
    protected Set<Paciente> pacientes;
    protected Set<IdentificacionPersonalSalud> identificacionPersonalSaluds;

    public HistoriaClinicaFisioterapia(NumeroHistoria Id, Posicion posicion) {
        super(Id);
        appendChange(new HistoriaDeFisioterapiaCreada(posicion)).apply();
    }

    //para crear una historia por primera vez ...
    private HistoriaClinicaFisioterapia(NumeroHistoria entityId){
        super(entityId);
        subscribe(new HistoriaClinicaFisioChange(this));

    }

    //para crear una historia en vace a los eventos nota:historia ya creada...
    public static HistoriaClinicaFisioterapia from(NumeroHistoria numeroHistoria, List<DomainEvent> events){
        var historia = new HistoriaClinicaFisioterapia(numeroHistoria);
        events.forEach(historia::applyEvent);
        return historia;
    }
    public void agregarControlDeOxigeno(NumeroControlOxigeno entityId, Fecha fecha, InicioControlOxigeno inicio, TerminacionControlOxigeno terminacion, Suministro suministro,LitrosOxigeno litrosOxigeno,ModoAdministracion modoAdministracion){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(fecha);
        Objects.requireNonNull(inicio);
        Objects.requireNonNull(terminacion);
        Objects.requireNonNull(suministro);
        Objects.requireNonNull(litrosOxigeno);
        Objects.requireNonNull(modoAdministracion);
        appendChange(new ControlDeOxigenoAgregado(entityId,fecha,inicio,terminacion,suministro,litrosOxigeno,modoAdministracion)).apply();
    }

    public void asociarIngreso(Ingreso ingreso){
        appendChange(new IngresoAsociado(ingreso)).apply();
    }

    public void agregarNotaDeCargo(NumeroNotaCargo id, Terapia terapia, SoporteVentilatorio soporteVentilatorio, Fecha fecha, Estado estado){
        appendChange(new NotaDeCargoAgregada(id,terapia,soporteVentilatorio,fecha,estado)).apply();
    }

    public void actualizarModoDeAdministracion(NumeroControlOxigeno id,ModoAdministracion administracion){
        appendChange(new ModoDeAdministracionActualizado(id,administracion)).apply();
    }

    public void agregarProfesionalSaludFisio(IdentificacionPersonalSalud entityId,Nombres nombres,Direccion direccion,Contacto contacto,Profesion profesion){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(nombres);
        Objects.requireNonNull(direccion);
        Objects.requireNonNull(contacto);
        Objects.requireNonNull(profesion);
        appendChange(new ProfesionalAgregadoFisio(entityId,nombres,direccion,contacto,profesion)).apply();
    }

}
