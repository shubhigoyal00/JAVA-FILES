abstract class Vehicle {
    abstract void start();
}

class Car extends Vehicle {
    void start() {
        System.out.println("Car starts with key");
    }
}

public class AbstractExample {
    public static void main(String[] args) {
        Vehicle myCar = new Car();
        myCar.start();
    }
}