class Emp {
    int Eid, sal;

    static String ceo;// static keyword means if changes once then it will not change in entire
                      // execution

    static { // when class loads , only one time execute,we can assign a variable as static
             // here
        ceo = "karan";// ceo is same for one company
        System.out.println("in static");
    }

    public void show()// execute whenever class calls in heaps
    {
        System.out.println("in non-static");
        System.out.println(Eid + " : " + sal + "  " + ceo);

    }
}

public class Statickey {
    // if we declare a variable here it must be static to use in main class else
    // error int i=0 ; static int i=0;we cant use a static in non static and
    // viceversa
    // int i = 0;

    public static void main(String[] args) {
        Emp Navin = new Emp();
        Emp Niketa = new Emp();

        Navin.Eid = 8;
        Navin.sal = 3000;
        // i = 9;
        Niketa.Eid = 9;
        Niketa.sal = 4000;

        Navin.show();
        Niketa.show();

    }

}
