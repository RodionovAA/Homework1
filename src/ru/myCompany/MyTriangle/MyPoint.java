/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.myCompany.mytriangle;

/**
 *
 * @author AleAlRodionov
 */
public class MyPoint {
    
    private int x = 0;
    private int y = 0;
    
    public MyPoint(){}
    
    public MyPoint(int x,int y){
        this.x = x;
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    
    public int[] getXY(){
       
        int[] res = new int[2];
        res[0] = this.x;
        res[1] = this.y;
        
        return res;
        
    }
    
    public void setXY(int x,int y){
        this.x = x;
        this.y = y;
    }
    
    public String toString(){
        return "("+Integer.toString(this.x)+","+Integer.toString(this.y)+")";
    }
    
    public double distance(int x,int y){
        double res = 0.0;
        res = Math.sqrt( Math.pow(x-this.x, 2.0)+Math.pow(y-this.y, 2.0));
        return res;
    }
    
    public double distance(MyPoint myPoint){
        double res = 0.0;
        res = Math.sqrt( Math.pow(myPoint.getX()-this.x, 2.0)+Math.pow(myPoint.getY()-this.y, 2.0));
        return res;
    }
    
    public double distance(){
        double res = 0.0;
        res = Math.sqrt( Math.pow(this.x, 2.0)+Math.pow(this.y, 2.0));
        return res;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + this.x;
        hash = 31 * hash + this.y;
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
        final MyPoint other = (MyPoint) obj;
        if (this.x != other.x) {
            return false;
        }
        if (this.y != other.y) {
            return false;
        }
        return true;
    }
    
}
