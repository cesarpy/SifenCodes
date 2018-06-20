package com.ccaceresv.sifencodes;

public enum Afectacion {
    GRAVADO_IVA(1,"Gravado IVA"),
    EXONERADO(2, "Exonerado (Art.83 - 125)"),
    EXENTO(3, "Exento"),
    GRAVADO_PARCIAL(4,"Gravado parcial");

    private Integer codigo;
    private String descripcion;


    private Afectacion(Integer codigo, String descripcion) {
        this.codigo = codigo;
        this.descripcion = descripcion;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
