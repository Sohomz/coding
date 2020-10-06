class A {
    public A() {
        // super();
        System.out.println("in A");
    }
}

class B extends A {
    public B() {
        // super();
        System.out.println("in B");
    }
}

public class Super1 {
    public static void main(String[] args) {
        B obj = new B();// if we call class B,there is by default a super constructor call i.e. A,so
                        // both will print

    }

}
