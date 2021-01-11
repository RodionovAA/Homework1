package ru.myCompany.mypolynomial;

import java.util.Arrays;

/**
 *
 * @author AleAlRodionov
 */
public class MyPolynomial {
    
    private double[] coeffs;
    
    public MyPolynomial(double... coeffs){
        this.coeffs = coeffs;   
    }
    public int getDegree(){
        return this.coeffs.length - 1;
    }
    
    public String toString(){
        String res = "";
        
        if (this.coeffs.length > 2){
            for(int i = this.coeffs.length-1; i>1; i--){
                res+=Double.toString(this.coeffs[i])+"x^"+Integer.toString(i)+"+";
            }
            
            res += Double.toString(this.coeffs[1])+"x+" + Double.toString(this.coeffs[0]);
            
        } else if (this.coeffs.length == 2){
            res = Double.toString(this.coeffs[1])+"x+" + Double.toString(this.coeffs[0]);
        } else if (this.coeffs.length == 1) {
            res = Double.toString(this.coeffs[0]);
        }
        return res;
    }
    public MyPolynomial add(MyPolynomial right){
        int resLength = Math.max(this.coeffs.length, right.coeffs.length);
        double[] resArr = new double[resLength];
        if (resLength == this.coeffs.length){
            for (int i = 0; i < right.coeffs.length; i++) {
                resArr[i] = this.coeffs[i]+right.coeffs[i];
            }
            for (int i = right.coeffs.length; i < resLength; i++) {
                resArr[i] = this.coeffs[i];
            }
            MyPolynomial res = new MyPolynomial(resArr);
            return res;
        } else {
             for (int i = 0; i < this.coeffs.length; i++) {
                resArr[i] = this.coeffs[i]+right.coeffs[i];
            }
            for (int i = this.coeffs.length; i < resLength; i++) {
                resArr[i] = right.coeffs[i];
            }
            MyPolynomial res = new MyPolynomial(resArr);
            return res; 
        }
    }
    
    public MyPolynomial multiply(MyPolynomial right) {
        double[] resArr = new double[right.coeffs.length + this.coeffs.length - 1];
        for (int i = 0; i < right.coeffs.length; i++) {
            for (int j = 0; j < this.coeffs.length; j++) {
                resArr[i + j] += right.coeffs[i] * this.coeffs[j];
            }
        }
        MyPolynomial res = new MyPolynomial(resArr);
        return res;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Arrays.hashCode(this.coeffs);
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
        final MyPolynomial other = (MyPolynomial) obj;
        if (!Arrays.equals(this.coeffs, other.coeffs)) {
            return false;
        }
        return true;
    }
    

}
