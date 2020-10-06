class A {
    public void show() {
        System.out.println("in A");
    }
}

// class B extends A {//this class used for override tha show() ,but we can do
// it another way by anonymous class
// public void show() {
// System.out.println("in B");
// }
// }

public class Anonymous_class {
    public static void main(String[] args) {
        A obj = new A() {// anonymous class, but we cant get A show()
            public void show() {
                System.out.println("in B");
            }
        };
        obj.show();
    }
}
