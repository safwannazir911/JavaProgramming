package threadModel;

class MyRunnable implements Runnable {
    private String threadName;

    MyRunnable(String name) {
        this.threadName = name;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(threadName + " - Count: " + i);
        }
    }
}

public class multipleThreads {
    public static void main(String[] args) {
        Thread t1 = new Thread(new MyRunnable("Thread 1"));
        Thread t2 = new Thread(new MyRunnable("Thread 2"));
        Thread t3 = new Thread(new MyRunnable("Thread 3"));

        t1.start();
        t2.start();
        t3.start();
    }
}
