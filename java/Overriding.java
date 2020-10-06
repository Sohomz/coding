class A {
    public void show() {
        System.out.println("in a");
    }
}

class B extends A {// child class method overrides the parent class method

    public void show() {
        // super.show();// to call the main class we use super.method(),else override
        // happen,only b's show eill print that overrides a's show()
        System.out.println("in b");

    }
}

public class Overriding {
    public static void main(String[] args) {// class b's show() overrides the a's show()
        B obj = new B();
        obj.show();

    }

}
