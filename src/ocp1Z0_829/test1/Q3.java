package ocp1Z0_829.test1;

/**
 * @author : [cycha]
 * @version : [v1.0]
 * @time : [2024/12/29 14:37]
 */

public class Q3 {

}

abstract class Employee1{
    abstract void work();
}

class Developer extends Employee1{

    @Override
    void work() {
        System.out.println("Developer");
    }

    void work(String project){
        System.out.println("Developer");
    }
}
