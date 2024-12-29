package ocp1Z0_829.question46;

import java.util.stream.Collectors;

public class Question46 {
    public static void main(String[] args) {

        try ( Folder folder = new Folder();){
            folder.open();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
