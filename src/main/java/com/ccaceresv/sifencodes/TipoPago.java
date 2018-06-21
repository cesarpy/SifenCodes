package com.ccaceresv.sifencodes;

import java.util.HashMap;
import java.util.Map;

public enum TipoPago {
    EFECTIVO(1,"01","Efectivo"),
    CHEQUE(2,"02","Cheque"),
    TARJETA_CREDITO(3,"03","Tarjeta de Crédito"),
    TARJETA_DEBITO(4,"04","Tarjeta de Débito"),
    TRANSFERENCIA(5,"05","Transferencia"),
    GIROS(6,"06","Giros"),
    BILLETERA_ELECTRONICA(7,"07","Billetera Electrónica"),
    TARJETAS_EMPRESARIALES(8,"08","Tarjetas Empresariales"),
    VALES(9,"09","Vales"),
    RETENCION(10,"10","Retenciones"),
    ANTICIPO(11,"11","Anticipos"),
    VALORES_FISCAL(12,"12","Valores fiscales"),
    VALORES_COMERCIAL(13,"13","Valores comerciales"),
    COMPENSACION(14,"14","Compensaciones"),
    OTRO(99,"99","OTRO");

    private Integer codigo;
    private String codigoStr;
    private String descripcion;


    private TipoPago(Integer codigo, String codigoStr, String descripcion) {
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


    private static final Map<Integer, TipoPago> codeMap = new HashMap<>();

    //vamos a cargar para poder buscar por codigo
    static {
        for(TipoPago tp : TipoPago.values()){
            codeMap.put(tp.getCodigo(), tp);
        }
    }

    public static TipoPago getByCodigo(Integer codigo){
        if (codigo == null){
            return null;
        }
        return codeMap.get(codigo);

    }
}
