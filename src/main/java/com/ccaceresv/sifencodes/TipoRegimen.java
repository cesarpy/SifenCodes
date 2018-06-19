package com.ccaceresv.sifencodes;

import java.util.HashMap;
import java.util.Map;

public enum TipoRegimen {
    TURISMO(1,"01","Régimen de Turismo"),
    IMPORTADOR(2,"02","Importador"),
    EXPORTADOR(3,"03","Exportador"),
    MAQUILA(4,"04","Maquila"),
    LEY_60_90(5,"05","Ley N° 60/90"),
    PRODUCTOR_PEQ(6,"06","Régimen del Pequeño Productor"),
    PRODUCTOR_MED(7,"07","Régimen del Mediano Productor"),
    CONTABLE(8,"08","Régimen Contable");

    private Integer codigo;
    private String codigoStr;
    private String descripcion;


    TipoRegimen(Integer codigo, String codigoStr, String descripcion) {
        this.codigo = codigo;
        this.codigoStr = codigoStr;
        this.descripcion = descripcion;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getCodigoStr() {
        return codigoStr;
    }

    public void setCodigoStr(String codigoStr) {
        this.codigoStr = codigoStr;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    private static final Map<Integer, TipoRegimen> codeMap = new HashMap<>();

    //vamos a cargar para poder buscar por codigo
    static {
        for(TipoRegimen tp : TipoRegimen.values()){
            codeMap.put(tp.getCodigo(), tp);
        }
    }

    public static TipoRegimen getByCodigo(Integer codigo){
        if (codigo == null){
            return null;
        }
        return codeMap.get(codigo);

    }
}
