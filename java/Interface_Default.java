
//in java 1.7 we cant define in interface , but  in 1.8 we can declare and define both in interface
//now what is the diff b/w abstract and interface?
//they both seem same from 1.8
@FunctionalInterface // this gives no error even we have two method but one thing is that two method
                     // in interface are diff , one is abstract one is default , so no error
interface A {
    void abc();

    default void show() {
        System.out.println("default must declare");
    }
}

class B implements A {
    public void abc() {
        System.out.println("in class B");
    }

    public void show() {// default method override
        System.out.println("override interface");
    }
}

public class Interface_Default {
    public static void main(String[] args) {
        A obj = new B();
        obj.abc();
        obj.show();
    }

}
