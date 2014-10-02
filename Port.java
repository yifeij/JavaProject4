/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adelaidecruiseline;

/**
 *
 * @author Yifei
 */
public class Port {
    private String name;
    private String country;
    private int population;
    private boolean passportRequirement;
    private double dockingFee;
    
    public Port(String name){
        this.name = name;
        this.country = "Australia";
        this.population = 100000;
        this.passportRequirement = false;
        this.dockingFee = 10;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public boolean isPassportRequirement() {
        return passportRequirement;
    }

    public void setPassportRequirement(boolean passportRequirement) {
        this.passportRequirement = passportRequirement;
    }
    
    public double getDockingFee() {
        return dockingFee;
    }

    public void setDockingFee(double dockingFee) {
        this.dockingFee = dockingFee;
    }

    @Override
    public String toString() {
        return "Port{" + "name=" + name + ", country=" + country + 
                ", population=" + population + ", passportRequirement=" + 
                passportRequirement+ ", dockingFee=" + dockingFee + '}';
    }
}
