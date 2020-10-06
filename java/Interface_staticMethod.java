interface Demo {
    static void show() {
        System.out.println("hi");// in this way we caan directly call this class without any implement class
    }
}

public class Interface_staticMethod {
    public static void main(String[] args) {
        Demo.show();

    }
}
