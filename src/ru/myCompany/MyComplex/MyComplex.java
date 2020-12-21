package ru.myCompany.mycomplex;
/**
 *
 * @author AleAlRodionov
 */
public class MyComplex {
    
  private double real = 0.0;
  private double image = 0.0;
    
  public MyComplex(){
  }  
  
  public MyComplex(double real, double image){
      this.real = real;
      this.image = image;
  } 
  
  public   double getReal(){
        return this.real;
  }
  
  public void setReal( double real){
        this.real = real;
  }

  public  double getImage(){
        return this.image;
  }
  
  public  void setImage(double image){
        this.image = image;
  }
  
 public  void setValue(double real,double image){
        this.real = real;
        this.image = image;
 }
 
  @Override
 public String toString(){
       String res = null;
       if (this.real != 0.0 && this.image == 0.0 ){
           res = Double.toString(this.real);
       } 
       if (this.real == 0.0 && this.image != 0.0){
           res = Double.toString(this.image) + "i";
       }
       if (this.real == 0.0 && this.image == 0.0){
           res = "0.0";
       }
       if (res == null){
           if (this.image > 0){
            res = Double.toString(this.real)+"+"+Double.toString(this.image)+"i";
           } else {
            res = Double.toString(this.real)+Double.toString(this.image)+"i";   
           }
       }    
       return res;
   }
    
   public  boolean isReal(){
        if (this.image == 0.0){
            return true;
        } else {
            return false;
        }
    }
   
   public  boolean isImaginary(){
        if (this.real == 0.0){
            return true;
        } else {
            return false;
        }
    }
   
    public boolean equals(double real, double image) {
        if ((this.real==real)&&(this.image==image)){
            return true;
        } else {
            return false;
        }
    }
    
     public boolean equals(MyComplex another) {
        if (this == another) {
            return true;
        }
        if (another == null) {
            return false;
        }
        
        if ((this.real == another.getReal())&&(this.image==another.getImage())){
            return true;
        } else {
            return false;
        }
    }
     
    public double magnitude(){
        return Math.sqrt((Math.pow(this.real, 2)+Math.pow(this.image, 2)));
    } 
    
   public double argument(){
        return Math.atan2(this.real, this.image);
    }

    public MyComplex add(MyComplex arg2) {
        this.setValue(this.real + arg2.getReal(), this.image + arg2.getImage());
        return this;
    }

    public MyComplex addNew(MyComplex arg2) {
        MyComplex res = new MyComplex(); 
        res.setValue(this.real + arg2.getReal(), this.image + arg2.getImage());
        return res;
    }
    
    public MyComplex substract(MyComplex arg2) {
        this.setValue(this.real - arg2.getReal(), this.image - arg2.getImage());
        return this;
    }
    
    public MyComplex substractNew(MyComplex right) {
        MyComplex res = new MyComplex(); 
        res.setValue(this.real - right.getReal(), this.image - right.getImage());
        return res;
    }
  
    public MyComplex multiply(MyComplex right) {
        this.setValue(this.real*right.getReal() - this.image*right.getImage(), this.image*right.getReal() + this.real*right.getImage());
        return this;
    }
    
    public MyComplex divide(MyComplex right){
        MyComplex res = new MyComplex();
        double reRes = (this.real*right.real+this.image*right.image)/(Math.pow(this.real, 2.0)+(Math.pow(this.image, 2.0)));
        double imRes = (right.real*this.image-this.real*right.image)/(Math.pow(this.real, 2.0)+(Math.pow(this.image, 2.0)));
        res.setValue(reRes, imRes);
        return res;
    }
    
    public MyComplex conjugate(){
        MyComplex res = new MyComplex(this.getReal(),-this.getImage());
        return res;   
    }
}
