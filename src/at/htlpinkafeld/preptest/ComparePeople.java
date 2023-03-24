package at.htlpinkafeld.preptest;

import java.util.Comparator;

public class ComparePeople implements Comparator<Person> {
    public int compare(Person o1, Person o2){
        return o2.getAge()-o1.getAge();
    }
}

class NameComparator implements Comparator<Person> {
    public int compare(Person o1, Person o2) {
        return o1.getFirstName().compareTo(o2.getFirstName());
    }
}

class LastNameComparator implements Comparator<Person>{
    public int compare(Person o1, Person o2){
        return o1.getLastName().compareTo(o2.getLastName());
    }
}