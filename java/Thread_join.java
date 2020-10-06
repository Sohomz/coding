public class Thread_join {
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

        // if i want to print after two thread over then use join
        t1.join();
        t2.join();

        System.out.println("after join");

    }
}
