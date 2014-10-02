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
public class Passenger {
    private int number;
    private String name;
    private String homeaddress;
    private String nationality;
    private Date dateOfBirth;       
    private int MoneySpendOnCruise;
    private EvaluationReport evaluationReport = new EvaluationReport();
    private String age;

    public Passenger(int number, String name, String nationality,
            Date dateOfBirth, int MoneySpendOnCruise ){
        this.number = number;
        this.name = name;
        this.homeaddress = "23 King William Street, Adelaide";
        this.nationality = nationality;
        this.dateOfBirth = dateOfBirth;
        this.MoneySpendOnCruise = MoneySpendOnCruise;
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

    public String getHomeaddress() {
        return homeaddress;
    }

    public void setHomeaddress(String homeaddress) {
        this.homeaddress = homeaddress;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getMoneySpendOnCruise() {
        return MoneySpendOnCruise;
    }

    public void setMoneySpendOnCruise(int MoneySpendOnCruise) {
        this.MoneySpendOnCruise = MoneySpendOnCruise;
    }
    
    public EvaluationReport getEvaluationReport() {
        return evaluationReport;
    }

    public void setEvaluationReport(EvaluationReport evaluationReport) {
        this.evaluationReport = evaluationReport;
    }
    
    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
    
    @Override
    public String toString() {
        return "Passenger{" + "number=" + number + ", name=" + name + 
                ", homeaddress=" + homeaddress + ", nationality=" + 
                nationality+ ", dateOfBirth=" + dateOfBirth +
                ", MoneySpendOnCruise=" + MoneySpendOnCruise + '}';
    }
    
  
}
