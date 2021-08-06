package com.redbee.academy.clase3;

import java.util.ArrayList;
import java.util.List;

public class Digitos {


    /**
     * Escriba un programa que determine la cantidad de dígitos en un número
     *
     * @return
     */
    public static Integer resolver(Long numero) {
        //TODO: implementar
        int cantidadDigitos=0;
        if(numero == 0){
            cantidadDigitos++;
        }else {
            while (numero != 0) {
                numero = numero / 10;
                cantidadDigitos++;
            }
        }
            return cantidadDigitos;

    }
}
