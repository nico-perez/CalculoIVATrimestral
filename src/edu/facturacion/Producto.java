package edu.facturacion;

public class Producto 
{
	private double importe;
	private String descripcion;
	
	public Producto(double importe, String descripcion)
	{
		this.importe = importe;
		this.descripcion = descripcion;
	}

	public double getImporte()
	{
		return importe;
	}

	public String getDescripcion()
	{
		return descripcion;
    }
}

