package com.ccaceresv.sifencodes;

import java.util.HashMap;
import java.util.Map;

public enum TipoTransaccionEmisor {
    MERCADERIA(1,"01","Venta de mercadería"),
    SERVICIOS(2,"02","Prestación de servicios"),
    MIXTO(3,"03","Mixto (Venta mercadería y servicios)"),
    ACTIVO_FIJO(4,"04","Venta de activo fijo"),
    DIVISAS(5,"05","Venta de divisas"),
    PROMOCIONES(6,"06","Promociones o entrega de muestras"),
    DONACION(7,"07","Donaciones"),
    OTRO(99,"99","OTRO");


    private Integer codigo;
    private String codigoStr;
    private String descripcion;


    private TipoTransaccionEmisor(Integer codigo, String codigoStr, String descripcion) {
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


    private static final Map<Integer, TipoTransaccionEmisor> codeMap = new HashMap<>();

    //vamos a cargar para poder buscar por codigo
    static {
        for(TipoTransaccionEmisor tte : TipoTransaccionEmisor.values()){
            codeMap.put(tte.getCodigo(), tte);
        }
    }

    public static TipoTransaccionEmisor getByCodigo(Integer codigo){
        if (codigo == null){
            return null;
        }
        return codeMap.get(codigo);

    }
}
