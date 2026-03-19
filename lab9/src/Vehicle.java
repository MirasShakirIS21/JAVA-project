// Базовый класс
class Vehicle {
    String name;

    Vehicle(String name) {
        this.name = name;
    }

    void startEngine() {
        System.out.println(name + " engine is starting.");
    }

    public static void main(String[] args) {
        Vehicle bike = new Bike("Mountain Bike");
        Vehicle bus = new Bus("City Bus");
        Vehicle taxi = new Taxi("Yellow Taxi");

        bike.startEngine();
        bus.startEngine();
        taxi.startEngine();
    }
}

// Производный класс Bike
class Bike extends Vehicle {
    Bike(String name) {
        super(name);
    }

    @Override
    void startEngine() {
        System.out.println(name + " is starting its small engine.");
    }
}

// Производный класс Bus
class Bus extends Vehicle {
    Bus(String name) {
        super(name);
    }

    @Override
    void startEngine() {
        System.out.println(name + " engine roars to life.");
    }
}

// Производный класс Taxi
class Taxi extends Vehicle {
    Taxi(String name) {
        super(name);
    }

    @Override
    void startEngine() {
        System.out.println(name + " taxi engine started, ready for passengers.");
    }
}