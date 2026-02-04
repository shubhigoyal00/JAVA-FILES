import java.util.LinkedList;

class Buffer {
    private final int capacity = 5;
    private final LinkedList<Integer> list = new LinkedList<>();

    public synchronized void produce(int value) throws InterruptedException {
        while (list.size() == capacity) {
            wait(); // Buffer full, wait for consumer
        }
        list.add(value);
        System.out.println("Produced: " + value);
        notify(); // Notify consumer
    }

    public synchronized int consume() throws InterruptedException {
        while (list.isEmpty()) {
            wait(); // Buffer empty, wait for producer
        }
        int value = list.removeFirst();
        System.out.println("Consumed: " + value);
        notify(); // Notify producer
        return value;
    }
}

class Producer extends Thread {
    private final Buffer buffer;

    public Producer(Buffer buffer) {
        this.buffer = buffer;
    }

    public void run() {
        int value = 0;
        try {
            for (int i = 0; i < 10; i++) { // Produce 10 items
                buffer.produce(value++);
                Thread.sleep(500); // Just to slow it down a bit
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Consumer extends Thread {
    private final Buffer buffer;

    public Consumer(Buffer buffer) {
        this.buffer = buffer;
    }

    public void run() {
        try {
            for (int i = 0; i < 10; i++) { // Consume 10 items
                buffer.consume();
                Thread.sleep(1000); // Just to slow it down a bit
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class ProducerConsumerDemo {
    public static void main(String[] args) {
        Buffer buffer = new Buffer();
        Producer producer = new Producer(buffer);
        Consumer consumer = new Consumer(buffer);
        
        producer.start();
        consumer.start();
        
        try {
            producer.join(); // Wait for producer to finish
            consumer.join(); // Wait for consumer to finish
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        System.out.println("Production and consumption completed.");
    }
}