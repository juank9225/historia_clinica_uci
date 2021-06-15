package co.com.sofka.historia.historiaClinicaMedica;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.historia.historiaClinicaMedica.events.*;
import co.com.sofka.historia.historiaClinicaMedica.values.*;

import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class HistoriaClinicaMedica extends AggregateEvent<Ingreso> {
    protected Diagnostico diagnostico;
    protected Set<Paciente> pacientes;
    protected Set<Evolucion> evoluciones;
    protected Set<ProfesionalSalud> profesionalSalud;
    protected Medicamento medicamento;
    protected Observacion observacion;

    public HistoriaClinicaMedica(Ingreso entityId, Diagnostico diagnostico,Observacion observacion, Medicamento medicamento) {
        super(entityId);
        appendChange(new DiagnosticoAgregado(diagnostico)).apply();
        appendChange(new ObservacionAgregada(observacion)).apply();
        appendChange(new MedicamentoAgregado(medicamento)).apply();
    }

    private HistoriaClinicaMedica(Ingreso entityId){
        super(entityId);
        subscribe(new HistoriaClinicaMedicaChange(this));

    }

    public void agregarEvolucion(NumeroEvolucion entityId, Fecha fecha, Estado estado){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(fecha);
        Objects.requireNonNull(estado);
        appendChange(new EvolucionAgregada(entityId,fecha,estado)).apply();

    }

    public void agregarPaciente(IdentificacionPaciente entityId,Nombres nombres,Direccion direccion,Contacto contacto,Acompanante acompanante){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(nombres);
        Objects.requireNonNull(direccion);
        Objects.requireNonNull(contacto);
        Objects.requireNonNull(acompanante);
        appendChange(new PacienteAgregado(entityId,nombres,direccion,contacto,acompanante)).apply();
    }

    public void agregarProfesionalSalud(IdentificacionPersonalSalud entityId,Nombres nombres,Direccion direccion,Contacto contacto,Profesion profesion){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(nombres);
        Objects.requireNonNull(direccion);
        Objects.requireNonNull(contacto);
        Objects.requireNonNull(profesion);
        appendChange(new ProfesionalAgregado(entityId,nombres,direccion,contacto,profesion)).apply();
    }

    public void actualizarNombreDePaciente(IdentificacionPaciente entityId,Nombres nombres){
        appendChange(new NombreDePacienteActualizado(entityId,nombres)).apply();
    }

    public void actualizarDireccionDePaciente(IdentificacionPaciente entityId,Direccion direccion){
        appendChange(new DireccionDePacienteActualizado(entityId,direccion)).apply();
    }

    public void actualizarContactoDePaciente(IdentificacionPaciente entityId,Contacto contacto){
        appendChange(new ContactoDePacienteActualizado(entityId,contacto)).apply();
    }

    public void actualizarAcompanante(IdentificacionPaciente identificacionPaciente,Acompanante acompanante){
        appendChange(new acompananteActualizado(identificacionPaciente,acompanante)).apply();
    }

    public Optional<Paciente> getPacientePorId(IdentificacionPaciente identificacionPaciente){
        return pacientes
                .stream()
                .filter(paciente ->paciente.identity().equals(identificacionPaciente))
                .findFirst();
    }

    public Optional<Evolucion> getEvolucionPorNumero(NumeroEvolucion numeroEvolucion){
        return evoluciones
                .stream()
                .filter(evolucion -> evolucion.identity().equals(numeroEvolucion))
                .findFirst();
    }

    public Optional<ProfesionalSalud> getProfesionalSalud(IdentificacionPersonalSalud identificacionPersonalSalud){
        return profesionalSalud
                .stream()
                .filter(profesionalSalud -> profesionalSalud.identity().equals(identificacionPersonalSalud))
                .findFirst();
    }

    public Diagnostico Diagnostico() {
        return diagnostico;
    }

    public Set<Paciente> Pacientes() {
        return pacientes;
    }

    public Set<Evolucion> Evoluciones() {
        return evoluciones;
    }

    public Set<ProfesionalSalud> ProfesionalSalud() {
        return profesionalSalud;
    }

    public Medicamento Medicamento() {
        return medicamento;
    }

    public Observacion Observacion() {
        return observacion;
    }
}
