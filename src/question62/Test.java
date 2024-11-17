package question62;

public class Test {
    public void process(byte v){
        System.out.printf("Byte value" +v);
    }
    public void process(short v){
        System.out.printf("Short value" +v);
    }
    public void process(Object v){
        System.out.printf("Object value" +v);
    }

    public static void main(String[] args) {
        byte x = 12;
        short y = 32;
        int i = x + y;
        new Test().process(i);
    }

/*在 Java 中，当两种不同的基本数据类型进行算术运算时，会发生类型提升（type promotion）或类型转换（type casting）。类型提升是指在表达式中，较小的数据类型会自动转换为较大的数据类型，以避免数据丢失。

对于 `byte` 和 `short` 类型，它们都是整型数据类型，但 `short` 的范围比 `byte` 大。`byte` 类型的取值范围是 -128 到 127，而 `short` 类型的取值范围是 -32768 到 32767。因此，当你将 `byte` 类型和 `short` 类型相加时，结果的类型会提升为 `short` 类型，以确保结果能够容纳可能的最大值。

然而，`short` 类型仍然不是表达式结果的最终类型。在 Java 中，任何时候只要涉及到 `int` 类型（无论是直接使用 `int` 类型的变量，还是通过字面量，如 `10`），较小的整型（如 `byte`、`short` 或 `char`）都会提升为 `int` 类型。这是因为 `int` 是 Java 中最常用的整型数据类型，它的范围足够大，可以容纳 `byte`、`short` 和 `char` 类型的所有可能值。

所以，当你执行 `byte x = 12;` 和 `short y = 13;` 并将它们相加时，结果是 `int` 类型，因为 `int` 类型可以容纳 `byte` 和 `short` 类型的所有可能值。这就是为什么 `byte x` 与 `short y` 相加后为 `int` 类型的原因。在这个例子中，`x + y` 的结果是 `25`，这是一个 `int` 类型的值。
*/
}
