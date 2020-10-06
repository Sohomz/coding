//Thread can be achieved by two mwthod
//1.Extending Thread class
//2.implements Runnable
//now why implement , see if we extend Thread class and we have a class A
//class B extends A,Thraed ---> but wait java does not support multiple inheritance 
//so class B extends A implements Runnable
class Hi extends Thread {
    public void run() {// show() to run()//override run() method
        for (int i = 0; i < 5; i++) {
            System.out.println("Hi");
            try {
                Thread.sleep(500);
            } catch (Exception e) {
            }
        }
    }
}

class Hello extends Thread {// show() to run()
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello");
            try {
                Thread.sleep(500);
            } catch (Exception e) {
            }
        }

    }
}

public class Thread_Types_1 {
    public static void main(String[] args) {
        Hi obj1 = new Hi();
        Hello obj2 = new Hello();

        obj1.start();
        try {// creating delay between two so that hi then hello will print
            Thread.sleep(10);
        } catch (Exception e) {
        }

        // obj1.show();// now this method cant make it multiso make method as run
        // obj2.show();// now this method cant make it multiso make method as run
        obj2.start();
    }
}
