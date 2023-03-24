package at.htlpinkafeld.preptest;

public class Person implements Comparable<Person> {
    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person: " + firstName + " " + lastName + ", " + age +
                " years.";
    }

    private String firstName;
    private String lastName;
    private int age;

    public int compareTo(Person p){
        int retVal;
        retVal = this.lastName.compareTo(p.lastName);
        if (retVal == 0){
            retVal = this.firstName.compareTo(p.firstName);
        }
        return retVal;
    }
}
