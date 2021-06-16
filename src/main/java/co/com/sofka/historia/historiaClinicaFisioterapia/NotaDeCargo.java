package co.com.sofka.historia.historiaClinicaFisioterapia;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.historia.historiaClinicaFisioterapia.values.NumeroNotaCargo;
import co.com.sofka.historia.historiaClinicaFisioterapia.values.SoporteVentilatorio;
import co.com.sofka.historia.historiaClinicaFisioterapia.values.Terapia;
import co.com.sofka.historia.historiaClinicaMedica.values.Estado;
import co.com.sofka.historia.historiaClinicaMedica.values.Fecha;

import java.util.Objects;

public class NotaDeCargo extends Entity<NumeroNotaCargo> {

    private Terapia terapia;
    private SoporteVentilatorio soporteVentilatorio;
    private Fecha fecha;
    private Estado estado;

    public NotaDeCargo(NumeroNotaCargo entityId, Terapia terapia, SoporteVentilatorio soporteVentilatorio, Fecha fecha, Estado estado) {
        super(entityId);
        this.terapia = terapia;
        this.soporteVentilatorio = soporteVentilatorio;
        this.fecha = fecha;
        this.estado = estado;
    }

    public void actualizarTerapia(Terapia terapia){
        this.terapia = Objects.requireNonNull(terapia);
    }

    public void actualizarSoporteVentilatorio(SoporteVentilatorio soporteVentilatorio){
        this.soporteVentilatorio = Objects.requireNonNull(soporteVentilatorio);
    }

    public void actualizarFechaNotaCarrgo(Fecha fecha){
        this.fecha = Objects.requireNonNull(fecha);
    }

    public void actualizarEstado(Estado estado){
        this.estado = Objects.requireNonNull(estado);
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
