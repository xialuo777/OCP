package pdfOcp.question110;

public class Question110 {

    public static void main(String[] args) {
        MyType<String> strType = new MyType<>();
        MyType<Integer> intType = new MyType<>();
        MyType<?> type = intType;
        strType.setValue("test");
//        type.setValue(1234);
        System.out.println(strType.getValue()+""+type.getValue());
    }

}
