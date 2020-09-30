package edu.facturacion;

import java.util.List;

public class Factura
{
    private int numero;
    private List<Producto> productos;
    
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }

    public List<Producto> getProductos() {
        return concepto;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }
    
}
