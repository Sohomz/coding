class Calc {// super,parent,base//IS-A
    public int add(int i, int j) {
        return (i + j);
    }
}

class Calc1 extends Calc {// sub,child,derived
    public int sub(int i, int j) {
        return (i - j);
    }
}

class Calc2 extends Calc1 {// multilevel
    public int mul(int i, int j) {
        return (i * j);
    }
}

public class Inherit {// HAS-A
    public static void main(String[] args) {
        Calc c1 = new Calc();
        int result1 = c1.add(3, 4);
        System.out.println(result1);

        Calc1 c2 = new Calc1();// we cant use Calc obj for sub, we have to call the child class i.e. Calc1
        int result2 = c2.add(3, 4);// but we can use the parent class method in child and ofcourse child
                                   // substraction
        int result4 = c2.sub(3, 4);

        System.out.println(result2);
        System.out.println(result4);

        Calc2 c3 = new Calc2();
        int result3 = c3.mul(3, 4);
        System.out.println(result3);

    }
}
