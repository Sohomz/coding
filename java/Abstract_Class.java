//abstract  class is used for if anyone wants a class that have no method defined,
// but later any class can extend it and can use it , then it is used 

abstract class Human {// abstract class
    // we can declare method , but method must be abstractf the class is abstract

    public abstract void eat();

    public void walk() {

    }

}

class Man extends Human {// concrete class
    // we must define abstract method here , else this class will also be abstract

    public void eat() {

    }// no need to declare walk method as this already done , but must declare
     // abstract method

}

public class Abstract_Class {
    public static void main(String[] args) {
        Human obj = new Man();// we cant make object of abstract class , but can take ref
    }

}
