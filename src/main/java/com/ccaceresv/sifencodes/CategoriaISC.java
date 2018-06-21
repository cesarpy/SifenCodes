package com.ccaceresv.sifencodes;

import java.util.HashMap;
import java.util.Map;

public enum CategoriaISC {
    SECCION1(1,"01","Sección I - (Cigarrillos, Tabacos, Esencias y Otros derivados del Tabaco)"),
    SECCION2(2,"02","Sección II - (Bebidas con y sin alcohol)"),
    SECCION3(3,"03","Sección III - (Alcoholes y Derivados del alcohol)"),
    SECCION4(4,"04","Sección IV- (Combustibles)"),
    SECCION5(5,"05","Sección V- (Artículos considerados de lujo)");


    private Integer codigo;
    private String codigoStr;
    private String descripcion;


    private CategoriaISC(Integer codigo, String codigoStr, String descripcion) {
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

    private static final Map<Integer, CategoriaISC> codeMap = new HashMap<>();

    //vamos a cargar para poder buscar por codigo
    static {
        for(CategoriaISC ci : CategoriaISC.values()){
            codeMap.put(ci.getCodigo(), ci);
        }
    }

    public static CategoriaISC getByCodigo(Integer codigo){
        if (codigo == null){
            return null;
        }
        return codeMap.get(codigo);

    }
}
