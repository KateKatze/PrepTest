package at.htlpinkafeld.employees;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeSorter {
    public static void main(String[] args) {
        List<Employee> empList = new ArrayList<>();
        empList.add(new Employee("Max", "Muster", 1500));
        empList.add(new Employee("Mary", "Muster", 2500));
        empList.add(new Employee("Mandy", "Muster", 3500));

        Collections.sort(empList, Collections.reverseOrder(new CompareEmployee()));
        showList("Sal reverse order" , empList);

        Collections.sort(empList, Collections.reverseOrder());
        showList("Reverse order" , empList);

        Collections.sort(empList);
        showList("Natural order" , empList);

        Collections.sort(empList, new CompareEmployee());
        showList("Sal order" , empList);
    }

    public static void showList(String header, List<Employee> empList) {
        System.out.println(header + ": ");
        for(Employee emp: empList){
            System.out.println(emp);
        }
    }
}
