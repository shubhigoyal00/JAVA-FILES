class MyThread extends Thread {
    public void run() {
        try { Thread.sleep(3000); } catch (InterruptedException e) {}
    }
}

public class IsAliveExample {
    public static void main(String[] args) throws InterruptedException {
        MyThread t1 = new MyThread();
        t1.start();
        System.out.println("Thread is alive? " + t1.isAlive());
        t1.join();
        System.out.println("Thread is alive after join? " + t1.isAlive());
    }
}
