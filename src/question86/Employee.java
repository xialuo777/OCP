package question86;

public class Employee {

    private String name;
    private String neighborhood;
    private int salary;

    public Employee(String name, String neighborhood, int salary) {
        this.name = name;
        this.neighborhood = neighborhood;
        this.salary = salary;
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
}
