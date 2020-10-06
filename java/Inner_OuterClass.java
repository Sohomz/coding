class Outer {
    public void show() {
        System.out.println("in outer class");
    }

    /*
     * Inner class can be 3 types 1. static Inner class ,2.method Inner class//in
     * this code 3.annonymous Inner class If the inner class be static then to call
     * it in Inner_OuterClass there will be Outer.Inner obj1 = new Outer.Inner();
     */
    class Inner {

        public void display() {
            System.out.println("in inner class");

        }
    }
}

public class Inner_OuterClass {
    public static void main(String[] args) {
        // we can access outer class easily
        Outer obj = new Outer();
        obj.show();

        // but to access inner class we need outer class object help
        Outer.Inner obj1 = obj.new Inner();
        obj1.display();
    }

}
