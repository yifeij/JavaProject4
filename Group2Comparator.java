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
public class Group2Comparator implements Comparator<Group2> {
    @Override
    public int compare(Group2 item1, Group2 item2){
        if(item1.getSailor().getSupervisor()!=null&&item1.getSailor().getSupervisor().equals(item2.getSailor())){
            return 1;
        }else if(item2.getSailor().getSupervisor()!=null&&item2.getSailor().getSupervisor().equals(item1.getSailor())){
            return -1;
        }else{
            return 0;
        }
    }
}
