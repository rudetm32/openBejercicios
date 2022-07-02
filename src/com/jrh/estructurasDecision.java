package com.jrh;

public class estructurasDecision {

    public static void main(String[] args) {
       /*
        * En este ejercicio tenéis que crear un bucle que permita concatenar textos e imprima
        * el resultado final por consola.
        * Tened en cuenta que los textos pueden venir de un array de tipo String. Por ejemplo:
        * String[] nombres = {"", "", "", ""}
        */
        String[] nombres = {"Pedro ", "Luis ", "Jose ", "Viridiana"};
        String suma = "";
        for(int i = 0; i<nombres.length; i++){
            suma += nombres[i];

        }
        System.out.println(suma);
         }
}
