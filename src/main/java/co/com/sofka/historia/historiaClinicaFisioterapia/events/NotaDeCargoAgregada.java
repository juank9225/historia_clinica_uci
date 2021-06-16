package co.com.sofka.historia.historiaClinicaFisioterapia.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.historia.historiaClinicaFisioterapia.values.NumeroNotaCargo;
import co.com.sofka.historia.historiaClinicaFisioterapia.values.SoporteVentilatorio;
import co.com.sofka.historia.historiaClinicaFisioterapia.values.Terapia;
import co.com.sofka.historia.historiaClinicaMedica.values.Estado;
import co.com.sofka.historia.historiaClinicaMedica.values.Fecha;

public class NotaDeCargoAgregada extends DomainEvent {

    private final NumeroNotaCargo id;
    private final Terapia terapia;
    private final SoporteVentilatorio soporteVentilatorio;
    private final Fecha fecha;
    private final Estado estado;
    public NotaDeCargoAgregada(NumeroNotaCargo id, Terapia terapia, SoporteVentilatorio soporteVentilatorio, Fecha fecha, Estado estado) {
        super("softka.historiaclinicafisioterapia.notadexargoagregada");
        this.id = id;
        this.terapia = terapia;
        this.soporteVentilatorio = soporteVentilatorio;
        this.fecha = fecha;
        this.estado = estado;
    }
}
