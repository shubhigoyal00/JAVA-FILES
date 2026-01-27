class MyThread extends Thread {
    public void run() {
        System.out.println(getName() + " started.");
        try { Thread.sleep(2000); } catch (InterruptedException e) {}
        System.out.println(getName() + " finished.");
    }
}

public class JoinExample {
    public static void main(String[] args) throws InterruptedException {
        MyThread t1 = new MyThread();
        t1.start();
        t1.join(); // Wait for t1 to complete before continuing
        System.out.println("Main thread finished.");
    }
}
