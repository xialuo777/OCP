package ocp1Z0_829.quesiton12;

public class Question12 {
    public static void main(String[] args) {
        A bobj = new B();
        A cobj = new C();
        if(cobj instanceof B v){
            v.mB();
            if (v instanceof C v1){
                v1.mC();
            }
        }else {
            cobj.mA();
        }
    }

}

class A{
    public void mA(){
        System.out.println("mA");
    }
}
class B extends A{
    public void mB(){
        System.out.println("mB");
    }
}

class C extends B{
    public void mC(){
        System.out.println("mC");
    }
}
