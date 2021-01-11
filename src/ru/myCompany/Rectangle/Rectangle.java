/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.myCompany.rectangle;

/**
 *
 * @author AleAlRodionov
 */

public class Rectangle {
    
    private float length = 1.0f;
    private float width = 1.0f;
     
    public Rectangle(){}
     
    public Rectangle(float length, float width){
         this.length = length;
         this.width = width;
     }
     
    public float getLength(){
         return this.length;
    }
     
    public void setLength( float length ){
         this.length = length;
    }
     
    public float getWidth(){
         return this.width;
    }
     
    public void setWidth(float width){
         this.width = width;
    }
      
    public double getArea(){
          return this.length*this.width;
    }
     
    public double getPerimetr(){
          return 2.0*(this.length + this.width);
    }
      
    public String toString(){
        return "Rectangle[length="+Float.toString(this.length)+",width="+Float.toString(this.width)+"}";
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 31 * hash + Float.floatToIntBits(this.length);
        hash = 31 * hash + Float.floatToIntBits(this.width);
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
        final Rectangle other = (Rectangle) obj;
        if (Float.floatToIntBits(this.length) != Float.floatToIntBits(other.length)) {
            return false;
        }
        if (Float.floatToIntBits(this.width) != Float.floatToIntBits(other.width)) {
            return false;
        }
        return true;
    }
    
}
