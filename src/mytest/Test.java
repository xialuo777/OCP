package mytest;

public class Test {
    public static void main(String[] args) {
        Person person = new Person("name",2);
        Person person3 = new Person("name",2);
        Person person2 = new Person("name2",3);
        System.out.println(person.equals(person2));
        System.out.println(person.equals(person3));


    }
}
