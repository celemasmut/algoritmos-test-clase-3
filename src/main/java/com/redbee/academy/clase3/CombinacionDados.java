package com.redbee.academy.clase3;

public class CombinacionDados {

    /**
     * Cuando tiramos 2 dados y sumamos los valores es posible generar un resultado comprendido entre 2 al 12.
     *
     * Generar un algoritmo que diga con cuantas combinaciones posibles se puede generar un valor dado.
     *
     * Por ej:
     * Para sacar 4 hay 3 combinaciones posibles: 1+3, 2+2 y 3+1
     * Para sacar 3 hay 2 combinaciones posibles: 1+2 y 2+1
     *
     * @param valor
     * @return
     */
    public static Integer resolverCombinacionesPosiblesCon2Dados(Integer valor) {
        // TODO: implementar

        int dado1=6;
        int dado2=6;
        Integer contador=0;
        for(int i =1 ; i <= dado1; i++){
            for(int j = 1; j <= dado2 ; j++){
                int suma = i+j;
                    if(suma == valor){
                        contador++;
                }
            }
        }
        return contador;
    }

    /**
     * Lo mismo pero con 3 dados
     *
     * @param valor
     * @return
     */
    public static Integer resolverCombinacionesPosiblesCon3Dados(Integer valor) {
        // TODO: implementar

        int dado1=6;
        int dado2=6;
        int dado3=6;
        Integer contador=0;
        for(int i =1 ; i <= dado1; i++){
            for(int j = 1; j <= dado2 ; j++){
                for(int g=1 ; g <= dado3 ; g++){
                    int suma = i+j+g;
                    if(suma == valor){
                        contador++;
                    }
                }

            }
        }
        return contador;
    }

}
