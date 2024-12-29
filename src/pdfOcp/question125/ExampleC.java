package pdfOcp.question125;

import java.util.Scanner;

public class ExampleC {
    public static void main(String[] args) {
        // 错误示例
        Scanner scanner = new Scanner(System.in);

//        char[] password = scanner.nextLine().toCharArray();
        char[] password = System.console().readPassword("Enter password: ");
// 这将隐藏输入的字符，但不会加密它们
        System.out.println(new String(password));
        // 输出密码，没有加密
    }
}
