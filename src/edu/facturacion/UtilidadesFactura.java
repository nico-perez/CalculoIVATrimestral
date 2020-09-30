package edu.facturacion;

public class UtilidadesFactura
{
    // Calcula el importe SIN IVA de la factura
    public static double calcularImporteFactura(Factura f)
    {
        double importe_sin_iva = 0.0;
        for (var producto : f.getProductos())
        {
            importe_sin_iva += producto.getImporte();
        }
        return importe_sin_iva;
    }

    // Calcula el IVA total de la factura
    public static double calcularIVAFactura(Factura f)
    {
        double iva = 0.0;
        for (var producto : f.getProductos())
        {
            iva += producto.getImporte() * producto.getIVA().pctj;
        }
        return iva;
    } 
    
    // Calcula el importe con IVA de la factura
    public static double calcularImporteFacturaConIVA(Factura f)
    {
        return calcularImporteFactura(f) + calcularIVAFactura(f);
    }
}
