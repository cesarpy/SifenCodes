package com.ccaceresv.sifencodes;

public enum IndicadorPresencia {
    PRESENCIAL(1,"Operación Presencial"),
    INTERNET(2,"Operación por internet"),
    TELEMARKETING(3,"Operación Telemarketing"),
    DOMICILIO(4,"Venta a domicilio"),
    MOVIL(5,"Venta móvil"),
    OTRO(9,"Otro");

    private Integer codigo;
    private String descripcion;


    IndicadorPresencia(Integer codigo, String descripcion) {
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
