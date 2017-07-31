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
public class Perceptron {

    private double bias; // Armazena o valor do bias do neurônio
    private double [] weights = new double[10]; // Armazena o valor dos pesos de cada conexão do neurônio
    
    /* Função de ativação - usada para o cálculo interno do Perceptron */
    private double sigmoid(double x){
        return 1.0/(1 + Math.exp(-x));
    }

    public double getBias(){
        return this.bias;
    }
    
    public double getWeight(int pos){
        return this.weights[pos];
    }
    
    public void setBias(double b){
        this.bias = b;
    }
    
    public void setWeight(int pos, double w){
        this.weights[pos] = w;
    }
    
    
    /* Função que faz o cálculo propriamente dito do Perceptron - sigmoid[(somatório de x_i * w_i) + bias] */
    public double calculate(InputData id){
        double sum = this.bias;
        for(int i = 0; i < 10; i++){
            sum += id.getInputData(i) * weights[i];
        }
        return this.sigmoid(sum);
    }
    
}
