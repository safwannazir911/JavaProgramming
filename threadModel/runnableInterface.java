package threadModel;

class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Thread is running...");
    }
}

public class runnableInterface {
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        Thread t1 = new Thread(myRunnable, "My Thread");
        t1.start(); // Start the thread
        System.out.println("Thread name: " + t1.getName());
    }
}
