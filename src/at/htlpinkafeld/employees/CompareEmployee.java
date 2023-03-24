package at.htlpinkafeld.employees;

import java.util.Comparator;

public class CompareEmployee implements Comparator <Employee> {
    public int compare(Employee o1, Employee o2){
        int retVal = Double.compare(o1.getSal(), o2.getSal());
        if (retVal == 0){
            retVal = o1.compareTo(o2);
        }
        return retVal;
    }

}
