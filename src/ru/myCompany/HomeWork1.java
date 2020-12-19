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
        
        Author[] b= {new Author()};
        
        Book a = new Book("Sasha",b,1.9);
      
        MyPoint point = new MyPoint(1,1);
        
        MyTriangle t = new MyTriangle(0,0,0,3,3,0);
        
        System.out.println(t.getPerimetr());
    }
    
}
