package com.ccaceresv.sifencodes;

import java.util.HashMap;
import java.util.Map;

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

    private static final Map<Integer, Afectacion> codeMap = new HashMap<>();

    //vamos a cargar para poder buscar por codigo
    static {
        for(Afectacion af : Afectacion.values()){
            codeMap.put(af.getCodigo(), af);
        }
    }

    public static Afectacion getByCodigo(Integer codigo){
        if (codigo == null){
            return null;
        }
        return codeMap.get(codigo);

    }
}
