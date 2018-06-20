package com.ccaceresv.sifencodes;

public enum Incoterms {
    CFR("CFR","Costo y flete"),
    CIF("CIF","Costo, seguro y flete"),
    CIP("CIP","Transporte y seguro pagados hasta"),
    CPT("CPT","Transporte pagado hasta"),
    DAP("DAP","Entregada en lugar convenido"),
    DAT("DAT","Entregada en terminal"),
    DDP("DDP","Entregada derechos pagados"),
    EXW("EXW","En fabrica"),
    FAS("FAS","Franco al costado del buque"),
    FCA("FCA","Franco transportista"),
    FOB("FOB","Franco a bordo"),
    ;

    private String codigo;
    private String descripcion;

    private Incoterms(String codigo,String descripcion) {
        this.codigo = codigo;
        this.descripcion = descripcion;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
