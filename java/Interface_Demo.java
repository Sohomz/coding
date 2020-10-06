interface Demo {
    void abc();

    default void show() {
        System.out.println("In Demo show");
    }
}

interface MyDemo {
    default void show() {
        System.out.println("In MyDemo show");
    }
}

class DemoImp implements Demo, MyDemo {
    public void abc() {
        System.out.println("In abc");
    }

    public void show() {
        Demo.super.show();// ** here we called super
    }
}

public class Interface_Demo {
    public static void main(String[] args) {
        Demo obj = new DemoImp();
        obj.abc();
        obj.show();// ? which show() is called , so we use super for 1st case **
    }

}
