package edu.facturacion;

import java.util.Calendar;
import java.util.List;

public class UtilidadesCalculoIVA 
{
    // Calculo 3 meses anteriores a la fecha (1 del mes del año)
    public static double calculoIVATrimestral(List<Factura> facturas, int mes, int año)
    {
        double iva_tri = 0.0;
        for (var factura : facturas)
        {
            Calendar fecha_actual = new Calendar.Builder().setDate(año, mes, 1).build(),
                     fecha_menos3 = (Calendar)fecha_actual.clone();
            fecha_menos3.add(Calendar.MONTH, -3);
            fecha_menos3.add(Calendar.DAY_OF_MONTH, -1);
            if (factura.getFecha().before(fecha_actual) 
                && factura.getFecha().after(fecha_menos3))
            {
                iva_tri += UtilidadesFactura.calcularIVAFactura(factura);
            }
        }
        return iva_tri;
    }
    
    // Calcula el IVA entre el último del mes-1 y el primero del mes+1
    public static double calculoIVAMesActual(List<Factura> facturas, int mes, int año)
    {
        double iva_mes = 0.0;
        for (var factura : facturas)
        {
            Calendar ultimo_dia_mes_anterior = new Calendar.Builder().setDate(año, mes, 1).build(),
                     primer_dia_mes_siguiente = (Calendar)ultimo_dia_mes_anterior.clone();
            ultimo_dia_mes_anterior.add(Calendar.DAY_OF_MONTH, -1);
            primer_dia_mes_siguiente.add(Calendar.MONTH, 1);
            if (factura.getFecha().after(ultimo_dia_mes_anterior)
                && factura.getFecha().before(primer_dia_mes_siguiente))
            {
                iva_mes += UtilidadesFactura.calcularIVAFactura(factura);
            }
        }
        return iva_mes;
    }
}
