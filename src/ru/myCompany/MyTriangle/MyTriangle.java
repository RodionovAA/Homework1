/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.myCompany.mytriangle;

import java.util.Objects;

/**
 *
 * @author AleAlRodionov
 */
public class MyTriangle {
    
    private MyPoint v1;
    private MyPoint v2;
    private MyPoint v3;
    
    
    public static boolean checkTriangle(MyPoint p1,MyPoint p2,MyPoint p3){
        
        double side1 = p1.distance(p2);
        double side2 = p2.distance(p3);
        double side3 = p3.distance(p1);
        
        if (((side1+side2)==side3)||((side1+side3)==side2)||(side2+side3)==side1 ){
            return true;
        }
        return false;
    }
    
    public MyTriangle(int x1,int y1,int x2,int y2,int x3,int y3){
        
        if (checkTriangle(new MyPoint(x1,y1),new MyPoint(x2,y2),new MyPoint(x3,y3) )){
            System.out.println("Triangle is degenerate");
        }
        
        this.v1 = new MyPoint(x1,y1);
        this.v2 = new MyPoint(x2,y2);
        this.v3 = new MyPoint(x3,y3);
    }
    
    public MyTriangle(MyPoint v1,MyPoint v2,MyPoint v3){
        if (checkTriangle(v1,v2,v3)){
            System.out.println("Triangle is degenerate");
        }
        
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }
    
    public String toString(){
        return "MyTriangle["+this.v1.toString()+","+this.v2.toString()+","+this.v3.toString()+"]";
    }
    
    public double getPerimetr(){
        
        double res = 0.0;
        res = this.v1.distance(this.v2);
        res += this.v2.distance(this.v3);
        res += this.v3.distance(this.v1);
        
        return res;
    }
    
    public String getType(){
        double side1 = this.v1.distance(this.v2);
        double side2 = this.v2.distance(this.v3);
        double side3 = this.v3.distance(this.v1);
        
        if ((side1 == side2) && (side2 == side3)){
            return "Equileteral";         
        } else if((side1 == side2) || (side2 == side3) || (side3 == side1) ) {
            return "Isosceal";
        }else {
            return "Scalene";
        }
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.v1);
        hash = 41 * hash + Objects.hashCode(this.v2);
        hash = 41 * hash + Objects.hashCode(this.v3);
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
        final MyTriangle other = (MyTriangle) obj;
        if (!Objects.equals(this.v1, other.v1)) {
            return false;
        }
        if (!Objects.equals(this.v2, other.v2)) {
            return false;
        }
        if (!Objects.equals(this.v3, other.v3)) {
            return false;
        }
        return true;
    }
    
    
    
}
