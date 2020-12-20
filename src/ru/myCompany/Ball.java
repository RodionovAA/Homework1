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
public class Ball {
    private float x;
    private float y;
    private int radius;
    private float xDelta;
    private float yDelta;
    
    public Ball(float x, float y,int radius, int speed, int direction){
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.xDelta = (float) (speed*Math.cos(direction%180));
        this.yDelta = -(float) (speed*Math.sin(direction%180));
    }

    public float getX() {
        return x;
    }
    
    public void setX(float x) {
        this.x = x;
    }
    
    public float getY() {
        return y;
    }
    
    public void setY(float y) {
        this.y = y;
    }
    
    public int getRadius() {
        return radius;
    }
    
    public void setRadius(int radius) {
        this.radius = radius;
    }
    
    public float getxDelta() {
        return xDelta;
    }

    public void setxDelta(float xDelta) {
        this.xDelta = xDelta;
    }

    public float getyDelta() {
        return yDelta;
    }

    public void setyDelta(float yDelta) {
        this.yDelta = yDelta;
    }
    
    public void move(){
        this.x+=this.xDelta;
        this.y+=this.yDelta;
    }
    
    public void reflectHorizontal(){
        this.xDelta = -this.xDelta;
    }
    
    public void reflectVertical(){
        this.yDelta = -this.yDelta;
    }
    public String toString(){
        return "Ball[("+Float.toString(this.x)+","+Float.toString(this.y)+",speed("+Float.toString(this.xDelta)+","+Float.toString(this.yDelta)+")]";
    }
}
