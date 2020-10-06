
@FunctionalInterface // anchor tag
interface Abc {
    void show();// functional interface -> one method
}

// class Implementor implements Abc {// go to annonymous
// void show() {
// System.out.println("anything");
// }
// }

public class Interface_annonymous {
    public static void main(String[] args) {
        // Abc obj=new Abc();--> gives error because we cant make object of an interface
        // so we can do that with annonymous class
        Abc obj = new Abc() {
            public void show() {
                System.out.println("anything");
            }
        };
        obj.show();
    }
}
// when we write the code in one line then lambda function