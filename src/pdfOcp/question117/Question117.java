package pdfOcp.question117;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class Question117 {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Alice", "Downtown", 5000, LocalDate.of(1990, 1, 1));
        Employee employee2 = new Employee("Bob", "Uptown", 6000, LocalDate.of(1985, 2, 2));
        Employee employee3 = new Employee("Charlie", "Downtown", 7000, LocalDate.of(1980, 3, 3));

        // Initialize the roster list
        List<Employee> roster = new ArrayList<>();
        roster.add(employee1);
        roster.add(employee2);
        roster.add(employee3);
        Map<String, Optional<Employee>> collect = roster.stream().
                collect(Collectors.groupingBy(Employee::getNeighborhood, Collectors.maxBy(Comparator.comparing(Employee::getSalary))));
        collect.entrySet().stream().forEach(entry -> {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue().get());
        });

        Map<String, Optional<Employee>> collect1 = roster.stream()
                .collect(Collectors.groupingBy(e -> e.getNeighborhood(), Collectors.maxBy((x, y) -> y.getSalary() - x.getSalary())));
        collect1.entrySet().stream().forEach(entry -> {
            System.out.println(entry.getValue().get());
        });
    }
}
