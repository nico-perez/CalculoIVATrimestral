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

    public Factura(int numero, List<Producto> productos)
    {
        this.numero = numero;
        this.productos = productos;
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

    @Override
    public String toString()
    {
        String s = "Factura número " + numero + "\n----------------\n";

        for (var producto : productos)
        {
            s += producto.getImporte() + "\t" + producto.getDescripcion() + "\n";
        }

        return s;
    }
}
