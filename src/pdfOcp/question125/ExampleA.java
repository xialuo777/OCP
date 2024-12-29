package pdfOcp.question125;

import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class ExampleA {
    public static void main(String[] args) {
        // 错误示例
        PrintWriter writer = new PrintWriter(new OutputStreamWriter(System.out));
        writer.print("Hello, World!");
// 这里不会立即输出，因为PrintWriter不会自动刷新流
        writer.flush(); // 需要显式调用flush()来输出
    }
}
