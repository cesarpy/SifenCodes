package com.ccaceresv.sifencodes;

import java.util.HashMap;
import java.util.Map;

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

    private static final Map<Integer, ImpuestoConsumo> codeMap = new HashMap<>();

    //vamos a cargar para poder buscar por codigo
    static {
        for(ImpuestoConsumo ic : ImpuestoConsumo.values()){
            codeMap.put(ic.getCodigo(), ic);
        }
    }

    public static ImpuestoConsumo getByCodigo(Integer codigo){
        if (codigo == null){
            return null;
        }
        return codeMap.get(codigo);

    }
}
