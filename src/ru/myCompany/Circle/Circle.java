/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.myCompany.circle;

import java.util.Objects;

/**
 *
 * @author AleAlRodionov
 */
public class Circle {
    
    private double radius = 1.0;
    private String color = "red";
    
    public Circle(){}
    
    public Circle(double radius){
        this.radius = radius;
    }
    
    public Circle(double radius,String color){
        this.radius = radius;
        this.color = color;
    }
    
    public double getRadius(){
        return this.radius;         
    }
    
    public String getColor(){
        return this.color;         
    }
    
    public void setRadius( double radius){
        this.radius = radius;         
    }
    
    public void setColor(String color){
        this.color = color;         
    }
    
    @Override
    public String toString(){
        return "Circle[radius="+Double.toString(this.getRadius())+"radius="+this.getColor()+"]";
    }
   
    public double getArea(){
        return Math.PI*Math.pow(radius, 2.0);
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 31 * hash + (int) (Double.doubleToLongBits(this.radius) ^ (Double.doubleToLongBits(this.radius) >>> 32));
        hash = 31 * hash + Objects.hashCode(this.color);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Circle other = (Circle) obj;
        if (Double.doubleToLongBits(this.radius) != Double.doubleToLongBits(other.radius)) {
            return false;
        }
        if (!Objects.equals(this.color, other.color)) {
            return false;
        }
        return true;
    }
    
}
