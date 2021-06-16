package co.com.sofka.historia.historiaClinicaFisioterapia.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.historia.historiaClinicaFisioterapia.values.NumeroNotaCargo;
import co.com.sofka.historia.historiaClinicaFisioterapia.values.SoporteVentilatorio;
import co.com.sofka.historia.historiaClinicaFisioterapia.values.Terapia;
import co.com.sofka.historia.historiaClinicaMedica.values.Estado;
import co.com.sofka.historia.historiaClinicaMedica.values.Fecha;

public class agregarNotaDeCargo implements Command {

    private final NumeroNotaCargo id;
    private final Terapia terapia;
    private final SoporteVentilatorio soporteVentilatorio;
    private final Fecha fecha;
    private final Estado estado;

    public agregarNotaDeCargo(NumeroNotaCargo id, Terapia terapia, SoporteVentilatorio soporteVentilatorio, Fecha fecha, Estado estado) {
        this.id = id;
        this.terapia = terapia;
        this.soporteVentilatorio = soporteVentilatorio;
        this.fecha = fecha;
        this.estado = estado;
    }

    public NumeroNotaCargo getId() {
        return id;
    }

    public Terapia getTerapia() {
        return terapia;
    }

    public SoporteVentilatorio getSoporteVentilatorio() {
        return soporteVentilatorio;
    }

    public Fecha getFecha() {
        return fecha;
    }

    public Estado getEstado() {
        return estado;
    }
}
