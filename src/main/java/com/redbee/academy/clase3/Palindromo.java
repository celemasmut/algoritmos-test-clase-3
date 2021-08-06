package com.redbee.academy.clase3;

public class Palindromo {

    /**
     * Generar un algoritmo que resuelva si una palabra es palindramo.
     *
     * Una palabra es palindromo cuando se lee de izquierda a derecha y de derecha a izquierda.
     * Por ej: neuquen
     *
     * @param palabra
     * @return
     */
    public static Boolean esPalindromo(String palabra) {
        // TODO: implementar
        boolean esPalindormo=false;
        if(palabra == null || palabra.length() < 1) return esPalindormo;
        int left=0;
        int right= palabra.length()-1;
        while (left < palabra.length()){
            if(palabra.charAt(left) == palabra.charAt(right)){
                esPalindormo=true;
            }
            left++;
            right--;
        }
        return esPalindormo;
    }
}
