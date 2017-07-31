/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.emakers.tombanana;

import java.io.Serializable;

/**
 *
 * @author bruno
 */
public class InputData implements Serializable{
    
    private double [] inputs = new double[10];
    
    public InputData(){
        this.inputs[0] = 0;
        this.inputs[1] = 0;
        this.inputs[2] = 0;
        this.inputs[3] = 0;
        this.inputs[4] = 0;
        this.inputs[5] = 0;
        this.inputs[6] = 0;
        this.inputs[7] = 0;
        this.inputs[8] = 0;
        this.inputs[9] = 0;
    }
    
    public InputData(double a, double b, double c, double d, double e, double f, double g, double h, double i, double j){
        this.inputs[0] = a;
        this.inputs[1] = b;
        this.inputs[2] = c;
        this.inputs[3] = d;
        this.inputs[4] = e;
        this.inputs[5] = f;
        this.inputs[6] = g;
        this.inputs[7] = h;
        this.inputs[8] = i;
        this.inputs[9] = j;
    }
    
    public double getInputData(int pos){
        return this.inputs[pos];
    }
    
    public void setInputData(int pos, double data){
        this.inputs[pos] = data;
    }
    
}
