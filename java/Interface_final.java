interface Demo {
    int num = 8; // this is by default final , we cant change this value of num

    void abc();

    static void show() {
        System.out.println("hi");// in this way we caan directly call this class without any implement class
    }
}

class DemoImp implements Demo {
    public void abc() {
        num = 11;// this give error as in interface any variable declre as final and method as
                 // abstract , if wanna define then default
    }
}

public class Interface_final {
    public static void main(String[] args) {
        Demo.show();

    }
}
