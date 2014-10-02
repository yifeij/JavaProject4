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
public class Group3Comparator implements Comparator<Group3> {
    @Override
    public int compare(Group3 item1, Group3 item2){
        return -(item1.getPassenger().getMoneySpendOnCruise()-item2.getPassenger().getMoneySpendOnCruise());
    }
}

