class A {
    public A() {
        // super();
        System.out.println("in A");
    }

    public A(int i) {

        System.out.println("in A int");
    }
}

class B extends A {
    public B() {
        super(5);// any number
        System.out.println("in B");
    }

    public B(int i) {
        super(i);// if we wanna call super i.e. A's parameterise constuctor
        System.out.println("in B int");
    }
}

public class Super4 {
    public static void main(String[] args) {
        B obj = new B();// if we call class B super with parameter then super class i.e.A's default
                        // constructor called
                        // A,so both will print,but in this case diff case happen

    }

}
