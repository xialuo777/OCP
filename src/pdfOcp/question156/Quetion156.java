package pdfOcp.question156;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Quetion156 {
    public static void main(String[] args) {
        File file1 = new File("file1.txt");
        File file2 = new File("file2.txt");
        try (BufferedReader reader = new BufferedReader(new FileReader(file1))){
            System.out.println(reader.readLine());
//            reader = new BufferedReader(new FileReader(file2));
            //当你在 try 语句的资源声明部分使用变量时，这个变量会被隐式地声明为 final。
            // 这意味着你不能在 try 块中重新赋值给这个变量。
            System.out.println(reader.readLine());
        }catch (IOException e){
            System.out.println("Error");
        }
    }
}
