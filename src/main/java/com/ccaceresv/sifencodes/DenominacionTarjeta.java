package com.ccaceresv.sifencodes;

import java.util.HashMap;
import java.util.Map;

public enum DenominacionTarjeta {
    VISA(1,"01","Visa"),
    MASTERCARD(2,"02","Mastercard"),
    AEX(3,"03","American Express"),
    MAESTRO(4,"04","Maestro"),
    OTRO(99,"99","OTRO");

    private Integer codigo;
    private String codigoStr;
    private String descripcion;


    DenominacionTarjeta(Integer codigo, String codigoStr, String descripcion) {
        this.codigo = codigo;
        this.codigoStr = codigoStr;
        this.descripcion = descripcion;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public String getCodigoStr() {
        return codigoStr;
    }

    public String getDescripcion() {
        return descripcion;
    }


    private static final Map<Integer, DenominacionTarjeta> codeMap = new HashMap<>();

    //vamos a cargar para poder buscar por codigo
    static {
        for(DenominacionTarjeta dt : DenominacionTarjeta.values()){
            codeMap.put(dt.getCodigo(), dt);
        }
    }

    public static DenominacionTarjeta getByCodigo(Integer codigo){
        if (codigo == null){
            return null;
        }
        return codeMap.get(codigo);

    }
}
