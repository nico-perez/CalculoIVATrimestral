package edu.gestion;

import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

import edu.facturacion.Factura;
import edu.facturacion.IVA;
import edu.facturacion.Producto;
import edu.facturacion.UtilidadesCalculoIVA;

/*
 * Ejercicio 3
 * 3.1. Añade un nuevo campo a la clase Factura que permita incluir la fecha de realización de la misma. 
 * 3.2. Haz 5 facturas distintas usando los productos que ya tienes (o añadiendo algunos nuevos) en varios trimestres de este año (un o dos en este mismo mes)
 * 3.3. Implementa las siguientes funciones en una clase llamada UtilidadesCalculoIVA y ejecutalas:
 *      double calculoIVATrimestral(List facturas) //Calculo 3 meses anteriores 1 del mes al actual
 *      double calculoIVAMesActual(List facturas)
 *      Nota: facturas es una lista que puede tener cero, una o varias facturas de cualquier mes y año.
 */

public class ejercicio3
{
    public static void main(String[] args)
    {
        List<Factura> facturas = Arrays.asList(
            new Factura(
                1,
                Arrays.asList(
                    new Producto(.05, "Chicle"),
                    new Producto(.70, "Botellín"),
                    new Producto(45_040, "Volkswagen Golf GTI", IVA.Reducido),
                    new Producto(.50, "Regaliz")
                ),
                new Calendar.Builder().setDate(2020, Calendar.JULY, 7).build()
            ),
            new Factura(
                2,
                Arrays.asList(
                    new Producto(499, "MÖRBYLÅNGA"),
                    new Producto(119.97, "LYSEKIL"),
                    new Producto(29, "NISSAFORS", IVA.Superreducido),
                    new Producto(39, "TILLREDA", IVA.Superreducido),
                    new Producto(549, "SVÄVANDE"),
                    new Producto(399, "RENGÖRA")
                ),
                new Calendar.Builder().setDate(2020, Calendar.JULY, 19).build()
            ),
            new Factura(
                3,
                Arrays.asList(
                    new Producto(12, "EIE", IVA.Reducido),
                    new Producto(20.90, "SGE")
                ),
                new Calendar.Builder().setDate(2020, Calendar.AUGUST, 27).build()
            ),
            new Factura(
                4,
                Arrays.asList(
                    new Producto(200, "Comida"),
                    new Producto(150, "Datos"),
                    new Producto(800, "Alquiler"),
                    new Producto(3600, "Velas"),
                    new Producto(150, "Utilidades")
                ),
                new Calendar.Builder().setDate(2020, Calendar.SEPTEMBER, 29).build()
            ),
            new Factura(
                5,
                Arrays.asList(
                    new Producto(30, "Mando"),
                    new Producto(7.99, "Auriculares"),
                    new Producto(2.50, "Helado"),
                    new Producto(4.99, "Pasta")
                ),
                new Calendar.Builder().setDate(2020, Calendar.OCTOBER, 2).build()
            )
        );
        for (var f : facturas) System.out.println(f);
        System.out.printf("IVA trimestral: %.2f€\n", UtilidadesCalculoIVA.calculoIVATrimestral(facturas, Calendar.OCTOBER, 2020));
        System.out.printf("IVA mensual: %.2f€\n", UtilidadesCalculoIVA.calculoIVAMesActual(facturas, Calendar.OCTOBER, 2020));
    }
}
