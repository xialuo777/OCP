package pdfOcp.question123;

public class Question123 {
    public static void main(String[] args) {
        try {
            if ("oracle".equals("ORACLE".toLowerCase())){
                throw new RuntimeException();
            }
        }catch (RuntimeException e){
            System.out.println("1");
        }
        catch (Exception e){
            System.out.println("2");
        }
        finally {
            System.out.println("3");
        }
    }
}
