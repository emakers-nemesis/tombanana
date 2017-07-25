/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.emakers.tombanana;

/**
 *
 * @author bruno
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /* Instancia objeto que cria vetor de entradas para a RNA, cada um dos 10 parâmetros é normalizado por uma constante */
        InputData iData =  new InputData(2.6/2.6, 77.0/77.0, 74.0/74.0, 7.0/7.0, 129.0/129.0, 4.2/4.2, 266.0/266.0, 19.0/19.0, 44.0/44.0, 12/12);
        
        /* Cria nova RNA do tipo Multi-Layer Perceptron com 10 entradas, 10 neurônios na camada escondida e um neurônio de saída */
        MLP RNA = new MLP();
        
        /* Imprime o resultado da RNA para o vetor iData e desnormaliza a saída */
        System.out.println(22 * RNA.calculate(iData));
    }
    
}
