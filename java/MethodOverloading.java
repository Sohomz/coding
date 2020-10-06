class Calc {
    // two types 1> number of parameters 2>datatypes
    public void add(int i, int j) {
        System.out.println(i + j);
        System.out.println("1st");
    }

    public void add(int i, int j, int k) {
        System.out.println(i + j + k);
        System.out.println("2nd");
    }

    public void add(int i, double j) {
        System.out.println(i + j);
        System.out.println("3rd");
    }
}

public class MethodOverloading {
    public static void main(String[] args) {

        Calc obj = new Calc();
        obj.add(2, 4, 2);
    }
}
