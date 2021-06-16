package co.com.sofka.historia.historiaClinicaFisioterapia;

import co.com.sofka.domain.generic.EventChange;
import co.com.sofka.historia.historiaClinicaFisioterapia.events.HistoriaDeFisioterapiaCreada;
import co.com.sofka.historia.historiaClinicaMedica.events.DiagnosticoAgregado;

import java.util.HashSet;

public class HistoriaClinicaFisioChange extends EventChange {
    public HistoriaClinicaFisioChange(HistoriaClinicaFisioterapia historiaClinicaFisioterapia) {
        apply((HistoriaDeFisioterapiaCreada event) ->{
            historiaClinicaFisioterapia.posicion = event.getPosicion();
            historiaClinicaFisioterapia.notaDeCargos = new HashSet<>();
            historiaClinicaFisioterapia.identificacionPersonalSaluds = new HashSet<>();
            historiaClinicaFisioterapia.controlDeOxigenos = new HashSet<>();
        });
    }
}
