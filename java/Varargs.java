class Abc {
    public int add(int... n) {
        int sum = 0;
        for (int i : n) {
            sum += i;
        }
        return sum;
    }

}

public class Varargs {
    public static void main(String[] args) {
        Abc obj = new Abc();
        System.out.println(obj.add(10, 2, 45, 4, 5, 34));

    }
}
