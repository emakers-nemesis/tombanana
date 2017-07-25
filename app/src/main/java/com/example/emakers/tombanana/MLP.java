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
public class MLP {
    private Perceptron [] hiddenLayer = new Perceptron[10]; // Neurônios da camada escondida
    private Perceptron output = new Perceptron(); // Neurônio da camada de saída
    
    public MLP(){
        /* Matriz de pesos e bias definida pela RNA da Tese para todos os neurônios da camada escondida e de saída */
        double [][] matrixOfWeights = {
            {0.8563429, -0.0589652, -0.6974715, 0.1146742, 0.8228284, -0.6828123, -1.0885815, -1.4623834, 0.5168435, -0.9455449, -0.5152022},
            {-0.1628215, -1.114086, -0.1374457, -0.2340729, -0.1922662, -0.7724176, -1.0142039, -0.0536103, 0.3658025, 0.6499350, 0.7539604},
            {-0.3568748, 0.0973359, -0.3407616, -0.5005035, -0.0921867, 0.8673795, 0.5154448, -0.4897125, -0.4880184, 0.1422821, 0.6188466},
            {0.6694995, -0.5443613, -0.3839717, 0.1170837, 0.0524361, -1.202283, -0.8185710, -0.4950533, 0.8390142, -0.4931848, -0.6087289},
            {-0.5323026, -0.1504304, -0.0794047, -0.6529011, 0.1384412, 0.2825466, 0.8670898, 1.2139329, 0.0181204, 0.0623597, 0.7037974},
            {1.8011457, -0.7153503, 0.0286166, -0.6150151, -0.2896828, -1.4123838, -1.3591646, -0.3156131, -0.3998717, 0.9609937, 0.5196838},
            {-0.4426601, -0.4768958, -0.5321114, 0.5145238, 0.5060528, -0.7075769, -0.4734055, 0.8907527, 0.8795049, 0.5013420, 0.7859457},
            {-0.0101564, 0.1763719, -0.8438700, 0.7143634, 0.5426854, -0.0454703, -0.0433163, -0.5859524, -0.6114770, -0.8399989, -1.0096559},
            {-0.2800785, 0.2497292, 0.1434172, -0.5749232, 0.8336457, 0.6708487, 0.3180852, -0.1956959, -1.1387181, 0.4467417, -0.6517239},
            {-1.8862119, 0.5368363, -0.5983274, 0.1531011, 0.6338459, 1.2109417, 1.1379011, 0.5003239, 0.1170099, -0.7487964, 0.1026138},
            {-0.2231681, -1.9466076, -0.4652277, 0.3162863, -1.5143643, 0.9019591, -2.0251358, 0.8190369, -0.4617266, 0.2864500, 1.7801262}};

        /* Atribui os pesos para cada neurônio da camada escondida da RNA */
        for(int i = 0; i < 10; i++){
            this.hiddenLayer[i] = new Perceptron();
            this.hiddenLayer[i].setBias(matrixOfWeights[i][0]);
            for(int j = 0; j < 10; j++){
                hiddenLayer[i].setWeight(j, matrixOfWeights[i][j + 1]);
            }
        }

        /* Atribui os pesos para o neurônio da camada de saída da RNA */
        output.setBias(matrixOfWeights[10][0]);
        for(int i = 0; i < 10; i++){
            output.setWeight(i, matrixOfWeights[10][i + 1]);
        }
    }
    
    /* Faz o cálculo da saída da RNA por meio da propagação das entradas para a camada escondida e depois para a saída */
    public double calculate(InputData id){
        InputData idOut = new InputData();
        for(int i = 0; i < 10; i++){
            idOut.setInputData(i, this.hiddenLayer[i].calculate(id));
        }
        return output.calculate(idOut);
    }
    
}
