class Counter {
    int count = 0;

    public synchronized void increment() {// only one thread at a time can access this
        count++;
    }
}

public class Sync {
    public static void main(String[] args) throws Exception {// for join

        Counter c = new Counter();
        Thread t1 = new Thread(new Runnable() {
            public void run() {
                for (int i = 1; i <= 1000; i++) {
                    c.increment();
                }
            }
        });
        Thread t2 = new Thread(new Runnable() {
            public void run() {
                for (int i = 1; i <= 1000; i++) {
                    c.increment();
                }
            }
        });

        t1.start();// it will print 0 cause t1 thread has not complete it task
        t2.start();// it will print 0 cause t1 thread has not complete it task

        t1.join();// after join it print 1000
        t2.join();// after join it print 1000
        // 1000+1000=2000

        System.out.println("count is " + c.count);
    }

}
