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
public class Group1 {
   
    private int money;
    private String nationality;
    private String age;
    private int number;
    
    public Group1(int money, String nationality, String age, int number){
        this.money = money;
        this.nationality = nationality;
        this.age = age;
        this.number = number;
    }
    
    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
      
   
}
