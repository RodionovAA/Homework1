package ru.myCompany.ball;

/**
 *
 * @author AleAlRodionov
 */
public class Container {
    
    private int x1;
    private int y1;
    private int x2;
    private int y2;
    
    public Container(int x, int y, int width, int heigth ){
        
        this.x1 = x;
        this.y1 = y;
        this.x2 = x+width;
        this.y2 = y+heigth;
    }
    
    public int getX() {
        return x1;
    }

    public void setX(int x) {
        this.x1 = x;
    }
    
    public int getY() {
        return y1;
    }

    public void setY(int y) {
        this.y1 = y;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }

    public int getWidth() {
        return Math.abs(x2-x1);
    }

    public int getHeight() {
        return Math.abs(y2-y1);
    }
    
    public boolean collides(Ball ball){
        
        if (((ball.getX() + ball.getRadius()) < this.x2) &&
            ((ball.getX() - ball.getRadius()) > this.x1) &&
            ((ball.getY() + ball.getRadius()) < this.y2) &&
            ((ball.getY() - ball.getRadius()) > this.y1)){

            return true;
        }
           return false;
        }

    public String toString(){
        return "Container[("+Integer.toString(this.x1)+","+Integer.toString(this.y1)+"),("+Integer.toString(this.x2)+","+Integer.toString(this.y2)+")]";
    }
    
    public static void main(String args[]){
        Ball b = new Ball(50.0f,50.0f,10,5,45);
        Container c = new Container(0,0,100,100);
        
        for(int i = 0;i<100;i++){

                b.move();
                
                if (b.getX() + b.getRadius() >= c.x2){
                    b.reflectVertical();
                }
                
                if (b.getX() - b.getRadius() <= c.x1){
                    b.reflectVertical();
                }
                
                if (b.getX() + b.getRadius() >= c.y2){
                    b.reflectHorizontal();
                }
                
               if (b.getX() - b.getRadius() <= c.y1){
                    b.reflectHorizontal();
                }

        }
    }
}
