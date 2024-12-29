package pdfOcp.question129;


import java.time.LocalDate;
import java.time.chrono.IsoChronology;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

public class Question129 {
    public static void main(String[] args) {
        List roster = new ArrayList<>();
        Predicate<Employee> p = e -> e.getSalary() > 25;
        LocalDate d = IsoChronology.INSTANCE.date(1989, 1, 1);
        Predicate<Employee> p2 = e -> e.getBirthDay().isAfter(d);
        long youngAndRich = roster.stream().filter(p)
                .filter(p2)
                .count();

        HashMap<String, String> hs = new HashMap();
        String[] key = {"1", "2", "3", "4"};
        String[] value = {"a", "b", "c", null};

        for (int i = 0; i < 4; i++) {
            hs.put(key[i], value[i]);
        }
        for (Map.Entry<String, String> stringStringEntry : hs.entrySet()) {

        }
    }

}

class Employee {
    private String name;
    private int salary;
    private LocalDate birthDay;

    public Employee(String name, int salary, LocalDate birthDay) {
        this.name = name;
        this.salary = salary;
        this.birthDay = birthDay;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(LocalDate birthDay) {
        this.birthDay = birthDay;
    }
}

