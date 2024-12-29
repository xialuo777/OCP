package ocp1Z0_829.test1;

import java.io.*;

/**
 * @author : [cycha]
 * @version : [v1.0]
 * @time : [2024/12/29 14:17]
 */

public class Q2 {

    public static void main(String[] args) {
        var emp = new Employee("John", 30, "IT");
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src/ocp1Z0_829/test1/employee.ser"));
             ObjectInputStream ois = new ObjectInputStream(new FileInputStream("src/ocp1Z0_829/test1/employee.ser"))) {
            oos.writeObject(emp);

            var e = (Employee) ois.readObject();
            System.out.printf("%s, %d, %s", e.getName(), e.getAge(), e.getDepartment());
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}


class Person {
    private String name;
    private int age;

    public Person() {
    };

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

class Employee extends Person implements Serializable {
    private String department;

    public Employee(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }
}
