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
public class Group1Comparator1 implements Comparator<Group1>  {
    @Override
    public int compare(Group1 item1, Group1 item2){
        return -(item1.getMoney()-item2.getMoney());
    }
}   
