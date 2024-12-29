package pdfOcp.question86;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Question86 {
    public static void main(String[] args) {
        List<Employee> roster = new ArrayList<>();
        Predicate<Employee> p = e -> e.getSalary() > 30;
        Function<Employee, Optional<String>> f = e -> Optional.ofNullable(e.getNeighborhood());

        Map<Optional<String>, List<Employee>> rA = roster.stream().collect(Collectors.groupingBy(f, Collectors.filtering(p,Collectors.toList())));
        Map<String, List<Employee>> rE = roster.stream().
                collect(Collectors.groupingBy(Employee::getNeighborhood, Collectors.filtering(p,Collectors.toList())));
    }
}
