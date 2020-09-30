package edu.facturacion;

public class Producto 
{
    private double importe;
    private String descripcion;
    private IVA iva;

    public Producto(double importe, String descripcion, IVA iva)
    {
        this.importe = importe;
        this.descripcion = descripcion;
        this.iva = iva;
    }

    public double getImporte()
    {
        return importe;
    }

    public String getDescripcion()
    {
        return descripcion;
    }

    public IVA getIVA()
    {
        return iva;
    }
}

