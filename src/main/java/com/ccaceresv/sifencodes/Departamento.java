package com.ccaceresv.sifencodes;

public enum Departamento {
    CAPITAL(1,"01","CAPITAL"),
    CONCEPCION(2,"02","CONCEPCION"),
    SAN_PEDRO(3,"03","SAN PEDRO"),
    CORDILLERA(4,"04","CORDILLERA"),
    GUAIRA(5,"05","GUAIRA"),
    CAAGUAZU(6,"06","CAAGUAZU"),
    CAAZAPA(7,"07","CAAZAPA"),
    ITAPUA(8,"08","ITAPUA"),
    MISIONES(9,"09","MISIONES"),
    PARAGUARI(10,"10","PARAGUARI"),
    ALTO_PARANA(11,"11","ALTO PARANA"),
    CENTRAL(12,"12","CENTRAL"),
    NEEMBUCU(13,"13","NEEMBUCU"),
    AMAMBAY(14,"14","AMAMBAY"),
    PRESIDENTE_HAYES(15,"15","PTE HAYES"),
    BOQUERON(16,"16","BOQUERON"),
    ALTO_PARAGUAY(17,"17","ALTO PARAGUAY"),
    CANINDEYU(18,"18","CANINDEYU"),
    CHACO(19,"19","CHACO"),
    NUEVA_ASUNCION(20,"20","NUEVA ASUNCION");

    private Integer codigo;
    private String codigoStr;
    private String descripcion;


    private Departamento(Integer codigo, String codigoStr, String descripcion) {
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
