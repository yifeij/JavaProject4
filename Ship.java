/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adelaidecruiseline;

import java.util.*;

/**
 *
 * @author Yifei
 */
public class Ship {
    private int number;
    private String name;
    private double weight;
    private int yearBuilt;
    private int capacity;
    private ArrayList<Sailor> sailors;

    public Ship(int number, String name) {
        this.number = number;
        this.name = name;
        this.weight = 10000; 
        this.yearBuilt = 2014;
        this.capacity = 50;
    }


    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getYearBuilt() {
        return yearBuilt;
    }

    public void setYearBuilt(int yearBuilt) {
        this.yearBuilt = yearBuilt;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    
    
  
    @Override
    public String toString() {
        return "Ship{" + "number=" + number + ", name=" + name + ", weight=" + 
                weight + ", yearBuilt=" + yearBuilt + ", capacity=" + capacity + '}';
    }   
    
    
}
