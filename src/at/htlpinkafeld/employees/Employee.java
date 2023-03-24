package at.htlpinkafeld.employees;

public class Employee implements Comparable<Employee> {
    public Employee(String name, String dept, double sal) {
        this.name = name;
        this.dept = dept;
        this.sal = sal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                ", sal=" + sal +
                '}';
    }

    private String name;
    private String dept;
    private double sal;

    public int compareTo(Employee emp){
        if (this == emp) {
            return 0;
        }
        if(this.name.compareTo(emp.name) != 0){
            return this.name.compareTo(emp.name);
        }
        if(this.dept.compareTo(emp.name) !=0){
            return this.dept.compareTo(emp.name);
        }
        if(this.sal == emp.sal){
            return 0;
        }
        if(this.sal > emp.sal){
            return 1;
        }
        return -1;
    }
}
