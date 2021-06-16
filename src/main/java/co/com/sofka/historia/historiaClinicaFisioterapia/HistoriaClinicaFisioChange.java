package co.com.sofka.historia.historiaClinicaFisioterapia;

import co.com.sofka.domain.generic.EventChange;
import co.com.sofka.historia.historiaClinicaFisioterapia.events.ControlDeOxigenoAgregado;
import co.com.sofka.historia.historiaClinicaFisioterapia.events.HistoriaDeFisioterapiaCreada;
import co.com.sofka.historia.historiaClinicaFisioterapia.events.ProfesionalAgregadoFisio;
import co.com.sofka.historia.historiaClinicaMedica.Paciente;
import co.com.sofka.historia.historiaClinicaMedica.ProfesionalSalud;
import co.com.sofka.historia.historiaClinicaMedica.events.*;

import java.util.HashSet;

public class HistoriaClinicaFisioChange extends EventChange {
    public HistoriaClinicaFisioChange(HistoriaClinicaFisioterapia historiaClinicaFisioterapia) {
        apply((HistoriaDeFisioterapiaCreada event) ->{
            historiaClinicaFisioterapia.posicion = event.getPosicion();
            historiaClinicaFisioterapia.notaDeCargos = new HashSet<>();
            historiaClinicaFisioterapia.profesionalSaluds = new HashSet<>();
            historiaClinicaFisioterapia.controlDeOxigenos = new HashSet<>();
        });
        apply((ControlDeOxigenoAgregado event) ->{
            historiaClinicaFisioterapia.controlDeOxigenos.add(new ControlDeOxigeno(
                    event.getId(),
                    event.getFecha(),
                    event.getInicio(),
                    event.getTerminacion(),
                    event.getSuministro(),
                    event.getLitrosOxigeno(),
                    event.getModoAdministracion()
            ));
        });

        apply((PacienteAgregado event) ->{
            historiaClinicaFisioterapia.pacientes.add(new Paciente(
                    event.getIdentificacionPaciente(),
                    event.getNombres(),
                    event.getDireccion(),
                    event.getContacto(),
                    event.getAcompanante()
            ));
        });

        apply((ProfesionalAgregadoFisio event) ->{
            historiaClinicaFisioterapia.profesionalSaluds.add(new ProfesionalSalud(
                    event.getIdentificacionPersonalSalud(),
                    event.getNombres(),
                    event.getDireccion(),
                    event.getContacto(),
                    event.getProfesion()
            ));
        });
    }
}
