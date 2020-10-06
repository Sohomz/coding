
interface Abc {
    void show();// functional interface -> one method
}

public class Interface_lambda {
    public static void main(String[] args) {
        Abc obj = () -> System.out.println("anything");// lambda function only achieed by functional interface i.e.one
                                                       // abstract method in interface
        obj.show();
    }
}
// when we write the code in one line then lambda function
// -> called lambda expression
