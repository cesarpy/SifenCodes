package com.ccaceresv.sifencodes;

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
}
