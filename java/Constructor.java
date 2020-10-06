//in java constructor needs because we have to assign a space for new object creation ,
// so that we can call it ,but how much space ?,thats why we need constructor for giving the space ,
//and it depends on variable in that class , so that every class has a default constructor named same as class name
//,this is member method of class , so we need () to call it,return nothing.

class Cons {
    int num1;
    int num2;
    float d;

    public Cons()// constructor without parameter
    {
        num1 = 2;
        num2 = 6;
        System.out.println("in void constructor");
    }

    public Cons(int n)// constructor with parameter
    {
        num1 = n;
        System.out.println("in int constructor");
    }

    public Cons(double d)// constructor with parameter
    {
        num1 = (int) d;
        System.out.println("in double constructor");

    }
}

class Constructor {
    public static void main(String[] args) {
        Cons obj1 = new Cons();
        // Cons obj1 = new Cons(7);
        // Cons obj1 = new Cons(5.65);
        System.out.println(obj1.num1);

    }
}
