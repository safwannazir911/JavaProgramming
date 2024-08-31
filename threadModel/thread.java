package threadModel;

class MyThread extends Thread {
    public MyThread(String name) {
        super(name); // Set the name of the thread
    }

    public void run() {
        System.out.println("Thread is running...");
    }
}

public class thread {
    public static void main(String[] args) {
        MyThread t1 = new MyThread("My Thread");
        t1.start(); // Start the thread
        System.out.println("Thread name: " + t1.getName());

    }
}
