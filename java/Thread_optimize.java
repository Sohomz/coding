//using annonymous class and lambda function we can optimize it

public class Thread_optimize {
    public static void main(String[] args) {

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Hi");
                try {
                    Thread.sleep(500);
                } catch (Exception e) {
                }
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Hello");
                try {
                    Thread.sleep(500);
                } catch (Exception e) {
                }
            }
        });
        t1.start();// now it will work
        try {// creating delay between two so that hi then hello will print
            Thread.sleep(10);
        } catch (Exception e) {
        }
        t2.start();
    }
}
