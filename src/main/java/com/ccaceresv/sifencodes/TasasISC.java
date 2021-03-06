package com.ccaceresv.sifencodes;

import java.util.HashMap;
import java.util.Map;

public enum TasasISC {
    UNO(1,"01","1%",1),
    CINCO(2,"02","5%",5),
    NUEVE(3,"03","9%",9),
    DIEZ(4,"04","10%",10),
    ONCE(5,"05","11%",11),
    TRECE(6,"06","13%",13),
    DIECISEIS(7,"07","16%",16),
    DIECIOCHO(8,"08","18%",18),
    VEINTE(9,"09","20%",20),
    VEINTICUATRO(10,"10","24%",24),
    TREINTA_CUATRO(11,"11","34%",34),
    TREINTA_OCHO(12,"12","38%",38);

    private Integer codigo;
    private String codigoStr;
    private String porcentaje;
    private Integer porcentajeCodigo;


    private TasasISC(Integer codigo, String codigoStr, String porcentaje,Integer porcentajeCodigo) {
        this.codigo = codigo;
        this.codigoStr = codigoStr;
        this.porcentaje = porcentaje;
        this.porcentajeCodigo = porcentajeCodigo;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public String getCodigoStr() {
        return codigoStr;
    }

    public String getPorcentaje() {
        return porcentaje;
    }

    private static final Map<Integer, TasasISC> codeMap = new HashMap<>();
    private static final Map<Integer, TasasISC> porcentajeMap = new HashMap<>();

    //vamos a cargar para poder buscar por codigo
    static {
        for(TasasISC ti : TasasISC.values()){
            codeMap.put(ti.getCodigo(), ti);
            porcentajeMap.put(ti.porcentajeCodigo,ti);
        }
    }

    public static TasasISC getByCodigo(Integer codigo){
        if (codigo == null){
            return null;
        }
        return codeMap.get(codigo);

    }

    public static TasasISC getByPorcentaje(Integer porcentaje){
        if (porcentaje == null){
            return null;
        }
        return porcentajeMap.get(porcentaje);

    }

}
