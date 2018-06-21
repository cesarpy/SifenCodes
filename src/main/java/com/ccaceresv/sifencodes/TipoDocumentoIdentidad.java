package com.ccaceresv.sifencodes;

import java.util.HashMap;
import java.util.Map;

public enum TipoDocumentoIdentidad {
    CEDULA(1,"Cédula de identidad Paraguaya"),
    PASAPORTE(2,"Pasaporte"),
    DOCUMENTO_EXTRANJERO(3,"Documento de identidad extranjero"),
    CARNET_RESIDENCIA(4,"Carnet de residencia"),
    INNOMINADO(5,"Innominado"),
    OTRO(9,"OTRO");

    private Integer codigo;
    private String descripcion;


    TipoDocumentoIdentidad(Integer codigo, String descripcion) {
        this.codigo = codigo;
        this.descripcion = descripcion;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    private static final Map<Integer, TipoDocumentoIdentidad> codeMap = new HashMap<>();

    //vamos a cargar para poder buscar por codigo
    static {
        for(TipoDocumentoIdentidad tdi : TipoDocumentoIdentidad.values()){
            codeMap.put(tdi.getCodigo(), tdi);
        }
    }

    public static TipoDocumentoIdentidad getByCodigo(Integer codigo){
        if (codigo == null){
            return null;
        }
        return codeMap.get(codigo);

    }
}
