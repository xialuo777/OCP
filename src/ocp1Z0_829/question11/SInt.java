package ocp1Z0_829.question11;

public sealed interface SInt permits Story, Art{
    default void getTitle(){
        System.out.println("Story");
    }
}
