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
public class Group2 {
    
    private Sailor sailor;
    private Cruise cruise;


    public Group2(Sailor sailor, Cruise cruise){
        this.sailor = sailor;
        this.cruise = cruise;  
    }

    public Sailor getSailor() {
        return sailor;
    }

    public void setSailor(Sailor sailor) {
        this.sailor = sailor;
    }
    
    public Cruise getCruise() {
        return cruise;
    }

    public void setCruise(Cruise cruise) {
        this.cruise = cruise;
    }
    
}
