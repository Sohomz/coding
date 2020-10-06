class A {
    public void show() {
        System.out.println("in a");
    }
}

class B extends A {
    public void show() {
        System.out.println("in b");
    }
}

class C extends B {
    public void show() {
        System.out.println("in c");
    }
}

public class Dynamic_Method_Dispatch {
    public static void main(String[] args) {
        // we can create referene of A ,but obj of B
        A obj = new B();// run time
        obj.show();

        obj = new C();// run time,obj is changing
        obj.show();// show is a method , so this is dynamic method dispatch

    }

}
