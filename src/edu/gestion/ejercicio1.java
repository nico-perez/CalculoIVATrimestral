package edu.gestion;

import java.util.ArrayList;
import java.util.Arrays;

import edu.facturacion.*;

/*
 * Ejercicio 1
 * 1.1. Completa los constructores de la clases Factura y Producto
 * 1.2. Crear una clase ejercicio1.java (main) que instancie una factura con los siguientes productos:
 *      (descripcion,  importe)    
 *       Leche,        0,75        
 *       Pan,          0,50     
 *       Salmón,       8,99     
 *       Aguacates,    2,95
 *       Friegasuelos, 1,20
 *       Cerveza,      0,56
 *       Sandia,       1,45
 * 1.3. Añade un método toString()  a la clase Factura que muestre todos los productos que contiene de forma clara.
 */

public class ejercicio1
{
    public static void main(String[] args)
    {
        Factura factura = new Factura(
            1,
            Arrays.asList(
                new Producto(0.75, "Leche"),
                new Producto(0.50, "Pan"),
                new Producto(8.99, "Salmón"),
                new Producto(2.95, "Aguacates"),
                new Producto(1.20, "Friegasuelos"),
                new Producto(0.56, "Cerveza"),
                new Producto(1.45, "Sandía")
            )
        );
        System.out.println(factura);
    }
}
