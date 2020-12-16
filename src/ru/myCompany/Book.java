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
public class Book {
    private String name;
    private Author[] authors;
    private double price;
    private int qty = 0;
    
    public Book(String name, Author[] authors,double price){
        this.name = name;
        this.authors = authors;
        this.price = price;
    }
    public Book(String name, Author[] authors,double price, int qty){
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }
    
    public String getName(){
        return this.name;
    }
    
    public Author[] getAuthors(){
        return this.authors;
    }
    
    public double getPrice(){
        return this.price;
    }
    public void setPrice(double price){
        this.price = price;
    }
    
    public int getQty(){
        return this.qty;
    }
    
    public void setQty(int qty){
        this.qty = qty;
    }
    
    public String getAuthorNames(){
        String res = null;
        int it=0;
        for (Author author : this.authors) {
            it++;
            if (it != this.authors.length){
            res += author.getName()+",";
            } else{
                res += author.getName();
            }
        }
        return res;
    }
    
    public String toString(){
        String res;
        res = "Book["+this.name+",authors{";
        for (Author author : this.authors) {
          res+= "Author[name="+author.getName()+",email="+author.getEmail()+",gender="+author.getGender()+"]";
        }
        res += "},price="+Double.toString(this.price)+",qty="+Integer.toString(this.qty)+"]";
        return res;
    }
}
