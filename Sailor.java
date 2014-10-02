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
public class Sailor {
    private int number;
    private String name;
    private Date dateOfBirth;
    private String nationality;
    private Sailor supervisor;

    
  
    public Sailor(int number){ 
        this.number = number;
        this.name = "Jeff";
        this.dateOfBirth = new Date(1989,8,31);
        this.nationality = "China";
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

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
    
    public Sailor getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(Sailor supervisor) {
        this.supervisor = supervisor;
    }
    
    @Override
    public String toString() {
        return "Sailor{" + "number=" + number + ", name=" + name + 
                ", dateOfBirth=" + dateOfBirth + ", nationality=" + nationality + '}';
    }   

 
    
    
    
    
}
