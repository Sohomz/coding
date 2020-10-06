class Cons {
    int num1;
    int num2;

    public Cons(int num1, int num2) {
        // num1 = num1;//0 as num1 assigned num1 itself,this two called the argument not
        // upper one
        // so to do this
        this.num1 = num1;
        this.num2 = num2;
        System.out.println("in void constructor");
    }

}

class Thiskey {
    public static void main(String[] args) {
        Cons obj1 = new Cons(2, 4);
        System.out.println(obj1.num1);
        System.out.println(obj1.num2);

    }
}
