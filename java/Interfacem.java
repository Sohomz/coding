//Types of interface
//1.Normal
//2.single abstract method - Functional Interface -Lambdda expression - scala// have only 1 abstract method
//3.Marker interface

interface Writer {// in interface we cant use any method just declare it and that must be
                  // abstract,by default it is abstract even if we dont mention it
                  // we cant make object of interface class but can create reference
    public abstract void write(); // functional interface -> one abstract method
                                  // if we define a default method here tha gives no error in func intf because it
                                  // is not abstract its default

}

class Pen implements Writer {// we can do : class Pen extends Abc implements Writer alos if Abc is a class
    public void write() {
        System.out.println("I am a Pen");

    }
}

class Pencil implements Writer {
    public void write() {
        System.out.println("I am a Pencil");

    }
}

class Kit {
    public void dosomething(Writer p) {
        p.write();

    }
}

public class Interfacem {
    public static void main(String[] args) {
        Kit k = new Kit();
        Writer p = new Pen();
        Writer pc = new Pencil();
        k.dosomething(p);
    }

}
