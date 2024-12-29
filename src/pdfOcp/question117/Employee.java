package pdfOcp.question117;

import java.time.LocalDate;

public class Employee {
    private String name;
    private String neighborhood;
    private int salary;
    private LocalDate birthday;
    public Employee(String name, String neighborhood, int salary, LocalDate birthday) {
        this.name = name;
        this.neighborhood = neighborhood;
        this.salary = salary;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", neighborhood='" + neighborhood + '\'' +
                ", salary=" + salary +
                ", birthday=" + birthday +
                '}';
    }
}
