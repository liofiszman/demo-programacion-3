package DTO;

// This code was generated by a tool. Don't modify it manually.
// http://sqldalmaker.sourceforge.net

public class Vehiculo  {

    private Integer id;  // t
    private Integer compania_seguro_id;  // t
    private Integer cliente_id;  // t
    private String numero_poliza;  // t
    private String marca;  // t
    private String patente;  // t

    public Integer get_id() {
        return this.id;
    }

    public void set_id(Integer id) {
        this.id = id;
    }

    public Integer get_compania_seguro_id() {
        return this.compania_seguro_id;
    }

    public void set_compania_seguro_id(Integer compania_seguro_id) {
        this.compania_seguro_id = compania_seguro_id;
    }

    public Integer get_cliente_id() {
        return this.cliente_id;
    }

    public void set_cliente_id(Integer cliente_id) {
        this.cliente_id = cliente_id;
    }

    public String get_numero_poliza() {
        return this.numero_poliza;
    }

    public void set_numero_poliza(String numero_poliza) {
        this.numero_poliza = numero_poliza;
    }

    public String get_marca() {
        return this.marca;
    }

    public void set_marca(String marca) {
        this.marca = marca;
    }

    public String get_patente() {
        return this.patente;
    }

    public void set_patente(String patente) {
        this.patente = patente;
    }
}