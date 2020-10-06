public class Thread_isAlive {
    public static void main(String[] args) throws Exception {// this handling is for join

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
        t1.start();
        try {
            Thread.sleep(10);
        } catch (Exception e) {
        }
        t2.start();
        t1.setName("Hi thread");
        t2.setName("Hello thread");
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);

        System.out.println("t1 priority is :" + t1.getPriority());
        System.out.println("t2 priority is :" + t2.getPriority());

        System.out.println(t1.getName());
        System.out.println(t2.getName());

        // after start is Alive is true
        System.out.println("t1 is :" + t1.isAlive());
        System.out.println("t2 is :" + t2.isAlive());

        t1.join();
        t2.join();
        // after join is Alive is false

        System.out.println("after join");
        System.out.println("t1 is :" + t1.isAlive());
        System.out.println("t2 is :" + t2.isAlive());

    }
}
