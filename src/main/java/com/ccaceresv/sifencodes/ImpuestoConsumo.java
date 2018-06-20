package com.ccaceresv.sifencodes;

public enum ImpuestoConsumo {
    IVA(1,"IVA"),
    ISC_GENERAL(2,"ISC General"),
    ISC_IMPORTACION(3,"ISC Importación"),
    ISC_COMBUSTIBLE(4,"ISC Combustible"),
    ISC_CIGARRILLO(5,"ISC Cigarrillo"),
    NINGUNO(6,"Ninguno");

    private Integer codigo;
    private String descripcion;


    ImpuestoConsumo(Integer codigo, String descripcion) {
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
