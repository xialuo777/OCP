package ocp1Z0_829.question41;

import java.io.*;

public class Question41 {
    public static void main(String[] args) {
        Product p = new Product("Cookie", 3.99f);
        try {
            try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("p.ser"))) {
                out.writeObject(p);
            }
            try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("p.ser"))) {
                p = (Product) in.readObject();
            }

        }catch (Exception e) {
            throw new RuntimeException(e);
        }
        System.out.println(p);
    }
}