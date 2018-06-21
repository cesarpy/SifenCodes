package com.ccaceresv.sifencodes;

import java.util.HashMap;
import java.util.Map;

public enum DocumentoElectronico {
    FACTURA_B2B(1,"01","Factura electrónica (B2B)"),
    FACTURA_B2C(2,"02","Factura electrónica consumidor (B2C)"),
    FACTURA_IMPORTACION(3,"03","Factura electrónica de importación"),
    FACTURA_EXPORTACION(4,"04","Factura electrónica de exportación"),
    AUTOFACTURA(5,"05","Autofactura electrónica"),
    NOTA_CREDITO(6,"06","Nota de crédito electrónica"),
    NOTA_DEBITO(7,"07","Nota de débito electrónica"),
    NOTA_REMISION(8,"08","Nota de remisión electrónica"),
    COMPROBANTE_RETENCION(9,"09","Comprobante de retención electrónico"),
    OTRO(99,"99","OTRO");


    private Integer codigo;
    private String codigoStr;
    private String descripcion;

    private DocumentoElectronico(Integer codigo, String codigoStr, String descripcion) {
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

    //Este lo dejamos para el caso de otros
    /*public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }*/

    private static final Map<Integer, DocumentoElectronico> codeMap = new HashMap<>();

    //vamos a cargar para poder buscar por codigo
    static {
        for(DocumentoElectronico de : DocumentoElectronico.values()){
            codeMap.put(de.getCodigo(), de);
        }
    }

    public static DocumentoElectronico getByCodigo(Integer codigo){
        if (codigo == null){
            return null;
        }
        return codeMap.get(codigo);

    }
}
