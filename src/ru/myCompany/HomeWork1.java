/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.myCompany;

/**
 *
 * @author AleAlRodionov
 */
public class HomeWork1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double[] input =   {10.0,14.0,1.0,2.0,3.0};
        double[] input1 =  {20.0,10.0,14.0};
     MyPolynomial a = new MyPolynomial(input);
     System.out.println(a.multiply(new MyPolynomial(input1)).toString());
    }
    
}
