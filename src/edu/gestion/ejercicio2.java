package edu.gestion;

import java.util.Arrays;

import edu.facturacion.*;

/*
 * Ejercicio 2
 * Crear una clase ejercicio2.java (main) usando como base la del ejercicio anterior.
 * 2.1. Añade una variable de tipo Enum a la clase Productos estableciendo los siguientes valores del IVA 4% (superreducido), 10% (reducido),  21% (normal)
 * 2.2. Sobre la lista de la compra que hiciste, añade a cada producto el tipo de IVA que tiene (no tiene que coincidir con el real) 
 * 2.3. Crea una clase UtilidadesFactura con los siguientes métodos:
 *      double calcularImporteFactura(Factura f) //Calcula el importe SIN IVA de la factura
 *      double calcularIVAFactura(Factura f) //Calcula el IVA total de la factura
 *      double calcularImporteFacturaConIVA(Factura f) //
 */

public class ejercicio2
{
    public static void main(String[] args)
    {
        Factura factura = new Factura(
            1,
            Arrays.asList(
                new Producto(0.75, "Leche", IVA.Normal),
                new Producto(0.50, "Pan", IVA.Reducido),
                new Producto(8.99, "Salmón", IVA.Normal),
                new Producto(2.95, "Aguacates", IVA.Normal),
                new Producto(1.20, "Friegasuelos", IVA.Normal),
                new Producto(0.56, "Cerveza", IVA.Superreducido),
                new Producto(1.45, "Sandía", IVA.Normal)
            )
        );
        System.out.printf(factura + "----------------\nImporte con IVA: %.2f", UtilidadesFactura.calcularImporteFacturaConIVA(factura));
    }
}
