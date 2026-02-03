class MyThread extends Thread {
    public MyThread(String name) { super(name); }

    public void run() {
        System.out.println(getName() + " (Priority: " + getPriority() + ")");
    }
}

public class PriorityExample {
    public static void main(String[] args) {
        MyThread t1 = new MyThread("Low Priority");
        MyThread t2 = new MyThread("High Priority");

        t1.setPriority(Thread.MIN_PRIORITY); // Priority 1
        t2.setPriority(Thread.MAX_PRIORITY); // Priority 10

        t1.start();
        t2.start();
    }
}
