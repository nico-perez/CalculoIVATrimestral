package edu.facturacion;

import java.util.ArrayList;
import java.util.List;

public class Factura
{
    private int numero;
    private List<Producto> productos;
    
    public Factura(int numero)
    {
        this.numero = numero;
        productos = new ArrayList<Producto>();
    }

    public int getNumero()
    {
        return numero;
    }

    public void setNumero(int numero)
    {
        this.numero = numero;
    }

    public List<Producto> getProductos()
    {
        return productos;
    }

    public void setProductos(List<Producto> productos)
    {
        this.productos = productos;
    }
}
