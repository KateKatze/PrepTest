package at.htlpinkafeld.preptest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PersonSorter {
    public static void main(String[] args) {
        Person[] persArr = new Person[5];
        persArr[0] = new Person("Mike", "Type", 28);
        persArr[1] = new Person("Dike", "Type", 29);
        persArr[2] = new Person("Nike", "Type", 30);
        persArr[3] = new Person("Bike", "Type", 31);
        persArr[4] = new Person("Zike", "Type", 32);

        Arrays.sort(persArr);
        showPerson("Natural", persArr);

        Arrays.sort(persArr, new ComparePeople());
        showPerson("By age", persArr);

        Arrays.sort(persArr, new LastNameComparator());
        showPerson("By last name", persArr);

        Arrays.sort(persArr, new NameComparator());
        showPerson("By first name", persArr);
    }

    public static void showPerson(String header, Person[] people) {
        System.out.println(header + ": ");
        for(Person p :people)
            System.out.println(p);
    }
}
