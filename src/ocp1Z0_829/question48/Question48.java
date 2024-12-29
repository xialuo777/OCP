package ocp1Z0_829.question48;

import java.util.List;

public class Question48 {
    public static void main(String[] args) {
        List<Book> books = List.of(new Book("A1", "T1"), new Book("A2", "T2"), new Book("A3", "T3"), new Book("A4", "T4"));
        books.sort((Book a, Book b) -> a.title.compareTo(b.title));
        System.out.println(books);
        Book book = new Book("A5", "T5");

    }
}
