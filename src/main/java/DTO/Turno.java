package DTO;

// This code was generated by a tool. Don't modify it manually.
// http://sqldalmaker.sourceforge.net

import java.time.LocalDate;
import java.time.LocalTime;

public class Turno  {

    private Integer id;  // t
    private Boolean active;  // t
    private LocalDate fecha;  // t
    private LocalTime hora;  // t
    private Integer mecanico_id;  // t
    private Integer vehiculo_id;  // t
    private Boolean asistencia;  // t
    private Integer ficha_mecanica_id;  // t

    public Integer get_id() {
        return this.id;
    }

    public void set_id(Integer id) {
        this.id = id;
    }

    public Boolean get_active() {
        return this.active;
    }

    public void set_active(Boolean active) {
        this.active = active;
    }

    public LocalDate get_fecha() {
        return this.fecha;
    }

    public void set_fecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public LocalTime get_hora() {
        return this.hora;
    }

    public void set_hora(LocalTime hora) {
        this.hora = hora;
    }

    public Integer get_mecanico_id() {
        return this.mecanico_id;
    }

    public void set_mecanico_id(Integer mecanico_id) {
        this.mecanico_id = mecanico_id;
    }

    public Integer get_vehiculo_id() {
        return this.vehiculo_id;
    }

    public void set_vehiculo_id(Integer vehiculo_id) {
        this.vehiculo_id = vehiculo_id;
    }

    public Boolean get_asistencia() {
        return this.asistencia;
    }

    public void set_asistencia(Boolean asistencia) {
        this.asistencia = asistencia;
    }

    public Integer get_ficha_mecanica_id() {
        return this.ficha_mecanica_id;
    }

    public void set_ficha_mecanica_id(Integer ficha_mecanica_id) {
        this.ficha_mecanica_id = ficha_mecanica_id;
    }
}
