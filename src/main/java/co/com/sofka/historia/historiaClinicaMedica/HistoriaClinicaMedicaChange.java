package co.com.sofka.historia.historiaClinicaMedica;

import co.com.sofka.domain.generic.EventChange;
import co.com.sofka.historia.historiaClinicaMedica.events.*;

import java.util.HashSet;

public class HistoriaClinicaMedicaChange extends EventChange {
    public HistoriaClinicaMedicaChange(HistoriaClinicaMedica historiaClinicaMedica) {

        apply((DiagnosticoAgregado event) ->{
            historiaClinicaMedica.diagnostico = event.getDiagnostico();
            historiaClinicaMedica.pacientes = new HashSet<>();
            historiaClinicaMedica.profesionalSalud = new HashSet<>();
            historiaClinicaMedica.evoluciones = new HashSet<>();
        });

        apply((MedicamentoAgregado event) ->{
            historiaClinicaMedica.medicamento = event.getMedicamento();
        });

        apply((ObservacionAgregada event)->{
            historiaClinicaMedica.observacion = event.getObservacion();
        });

        /*   apply((EvolucionAgregada event) ->{
          var evolucion =  historiaClinicaMedica.getEvolucionPorNumero(event.getNumeroEvolucion())
                    .orElseThrow(()-> new  IllegalArgumentException("No se encontro el estado de la evolucion"));
            evolucion.actualizarEstado(event.getEstado());
        });
        */

        apply((NombreDePacienteActualizado event) ->{
           var paciente = historiaClinicaMedica.getPacientePorId(event.getIdentificacionPaciente())
                    .orElseThrow(()->new IllegalArgumentException("No se encontro el paciente para el cambio de nombre"));
            paciente.actualizarNombres(event.getNombres());
        });

        apply((DireccionDePacienteActualizado event) ->{
           var paciente = historiaClinicaMedica.getPacientePorId(event.getIdentificacionPaciente())
                    .orElseThrow(()->new IllegalArgumentException("No se encontrol el paciente para el cambio de direccion"));
            paciente.actualizarDireccion(event.getDireccion());
        });

        apply((ContactoDePacienteActualizado event) ->{
            var paciente =historiaClinicaMedica.getPacientePorId(event.getIdentificacionPaciente())
                    .orElseThrow(()-> new IllegalArgumentException("No se encontro el paciente para el cambio de contacto"));
            paciente.actualizarContacto(event.getContacto());
        });

        apply((acompananteActualizado event)->{
            var paciente =historiaClinicaMedica.getPacientePorId(event.getIdentificacionPaciente())
                    .orElseThrow(()->new IllegalArgumentException("No se encontro el paciente para el cambio de acopañante"));
            paciente.actualizarAcompanante(event.getAcompanante());
        });

        apply((EvolucionAgregada event) ->{
            historiaClinicaMedica.evoluciones.add(new Evolucion(
                    event.getNumeroEvolucion(),
                    event.getFecha(),
                    event.getEstado()
            ));
        });

        apply((PacienteAgregado event) ->{
            historiaClinicaMedica.pacientes.add(new Paciente(
                    event.getIdentificacionPaciente(),
                    event.getNombres(),
                    event.getDireccion(),
                    event.getContacto(),
                    event.getAcompanante()
            ));
        });

        apply((ProfesionalAgregado event) ->{
            historiaClinicaMedica.profesionalSalud.add(new ProfesionalSalud(
                    event.getIdentificacionPersonalSalud(),
                    event.getNombres(),
                    event.getDireccion(),
                    event.getContacto(),
                    event.getProfesion()
            ));
        });


    }
}
