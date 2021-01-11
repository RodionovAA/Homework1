/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.myCompany.employee;

import java.util.Objects;

/**
 *
 * @author AleAlRodionov
 */
public class Employee {
    
    private int id;
    private String firstName;
    private String lastName;
    private int salary;
    
    public Employee(int id, String firstName, String lastName, int salary){

        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }
    
    public int getID(){
        return this.id;
    }
    
    public String getFirstName(){
        return this.firstName;
    }
     
     public String getLasrName(){
        return this.lastName;
    }
    
    public String getName(){
        return this.firstName+" "+this.lastName;
    }
      
    public int getSalary(){
        return this.salary;
    }
       
    public void setSalary(int salary){
        this.salary = salary;
    }
    
    public int getAnnualSalary(){
        return this.salary*12;
    }
    
    public int raiseSalary(int persent){
        this.salary = (this.salary*(100+persent)/100);
        return this.salary;
    }
    
    public String toString(){
        return "Employee[id="+Integer.toString(this.id)+",name="+this.firstName+" "+this.lastName+",salary="+Integer.toString(this.salary)+"]";
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + this.id;
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
        final Employee other = (Employee) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    
    
}
