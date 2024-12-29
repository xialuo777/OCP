package ocp1Z0_829.question43;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Question43 {
    public static void main(String[] args) {
        SoftWare s = new Game("Chess", 2);
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("game.ser"))){
            out.writeObject(s);
        }catch (Exception e){
            System.out.println("write error");
        }
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("game.ser"))){
            s = (SoftWare) in.readObject();
        }catch (Exception e){
            System.out.println("read error");
        }
        System.out.println(s);
    }
}
