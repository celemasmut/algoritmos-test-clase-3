package com.redbee.academy.clase3;

import java.util.ArrayList;
import java.util.List;

public class Cuil {

    /**
     * Un CUIL es un número que consta de 11 dígitos y está conformado de la siguiente manera:
     *
     * XX-12345678-Y
     *
     * Donde XX es el tipo de persona física o jurídica y pueden ser los siguientes:
     * 27 es para mujeres
     * 20 es para hombres
     * 23 puede ser ambos (se usa cuando hay otro número igual)
     * 30 empresas
     *
     * Generar un algoritmo para poder calcular el valor de Y que se hace de la siguiente forma:
     * A cada uno de los 10 dígitos que conocemos, se multiplica por: 5, 4, 3, 2, 7, 6, 5, 4, 3, 2 respectivamente
     *
     *
     * Se suman los valores obtenidos, el resultado se divide por 11, y del resultado  se toma el primer decimal.
     * Ese primer decimal se resta a 11 y el resultado es el numero verificador.
     *
     *
     * EJEMPLO
     * DNI 12.345.678 Masculino
     *
     * 2 0 1 2 3 4 5 6 7 8
     * x
     * 5 4 3 2 7 6 5 4 3 2
     * ————————————————————
     * 10+0+3+4+21+24+25+24+21+16= 148
     *
     *
     * 148 dividido 11 = 5 ( porque 148/11= 13,454 –; .454 se redondea a 5).
     * 11-5 = 6
     *
     * Entonces, el CUIL es 20-12345678-6
     *
     * @param tipoPersona
     * @param dni
     * @return
     */
    public static Integer calcular(Integer tipoPersona, Integer dni) {
        // TODO: implementar
        List<Integer> numerosPersona = new ArrayList<>();
        llenarLista(separarDecimal(tipoPersona),numerosPersona);
        llenarLista(separarDecimal(dni),numerosPersona);
        List<Integer>digitosAmultiplicar = new ArrayList<>();
        ingresaDigitosAmultiplicarAlista(digitosAmultiplicar,5,4,3,2,7,6,5,4,3,2);

        int posicion = 0;
        int multiplica;
        int suma=0;
        while (posicion < numerosPersona.size()){
            multiplica = numerosPersona.get(posicion) * digitosAmultiplicar.get(posicion);
            suma+=multiplica;
            posicion++;
        }

        double resto = (suma % 11.0);

        return  11- (int)resto;
    }
    private static void ingresaDigitosAmultiplicarAlista(List<Integer>listaDeDigitosXmultiplicar,int a, int b, int c, int d, int e, int f, int g, int h, int i, int j){
        listaDeDigitosXmultiplicar.add(a);
        listaDeDigitosXmultiplicar.add(b);
        listaDeDigitosXmultiplicar.add(c);
        listaDeDigitosXmultiplicar.add(d);
        listaDeDigitosXmultiplicar.add(e);
        listaDeDigitosXmultiplicar.add(f);
        listaDeDigitosXmultiplicar.add(g);
        listaDeDigitosXmultiplicar.add(h);
        listaDeDigitosXmultiplicar.add(i);
        listaDeDigitosXmultiplicar.add(j);
    }
    private static List<Integer> separarDecimal(Integer numero){
        List<Integer>numerosSeparados = new ArrayList<>();
        while (numero > 0) {
            int nuevoNumero = numero % 10;
            numero = numero / 10;
            numerosSeparados= agregarAlPrincipio(numerosSeparados,nuevoNumero);
        }
        return numerosSeparados;
    }

    private static List<Integer>agregarAlPrincipio(List<Integer>listaAAgregar, int numero){
        int contador = 0;
        if(listaAAgregar != null) {
            while (contador < listaAAgregar.size()) {
                if (listaAAgregar.get(contador) == null) {
                    listaAAgregar.remove(contador);
                }
                contador++;
            }
        }
        listaAAgregar.add(0, numero);
        return listaAAgregar;
    }
    private static void llenarLista(List<Integer> numerosSeparados, List<Integer>numerosPersona){
        for(Integer elemento : numerosSeparados){
            numerosPersona.add(elemento);
        }
    }
}
