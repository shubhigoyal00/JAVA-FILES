class SharedResource {
    private int count = 0;

    public synchronized void increment() {
        count++;
        System.out.println(Thread.currentThread().getName() + " -> " + count);
    }
}

class MyThread extends Thread {
    SharedResource resource;
    public MyThread(SharedResource resource) { this.resource = resource; }

    public void run() {
        for (int i = 0; i < 3; i++) resource.increment();
    }
}

public class SyncExample {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();
        new MyThread(resource).start();
        new MyThread(resource).start();
    }
}
