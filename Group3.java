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
public class Group3 {
    private Passenger passenger;
    private Cruise cruise;
    
    public Group3(Passenger passenger, Cruise cruise){
        this.passenger = passenger;
        this.cruise = cruise;  
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public Cruise getCruise() {
        return cruise;
    }

    public void setCruise(Cruise cruise) {
        this.cruise = cruise;
    }
    
}
