package com.jrh;

import static java.lang.System.out;

public class funciones {

    public static void main(String[] args) {

        out.println(total(100, .15));
        out.println(total(100, .10));
        out.println(total(98.10, .15));
        out.println(total(1000.20, .15));


        }
    static String total(double precio, double iva) {
        double precioIva =  precio * iva;
        double total = precioIva + precio;
        return  "El precio con IVA es:  " + total;
    }

}
