
class Transport {
    String name;
    int speed;

    Transport(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    void move() {
        System.out.println(name + " is moving.");
    }

    
    public static void main(String[] args) {
        
        Transport car = new Car("Toyota", 120);
        Transport train = new Train("Express", 200);
        Transport airplane = new Airplane("Boeing", 800);

    
        car.move();
        train.move();
        airplane.move();
    }
}


class Car extends Transport {
    Car(String name, int speed) {
        super(name, speed);
    }

    @Override
    void move() {
        System.out.println(name + " is driving on the road at " + speed + " km/h.");
    }
}


class Train extends Transport {
    Train(String name, int speed) {
        super(name, speed);
    }

    @Override
    void move() {
        System.out.println(name + " is moving on rails at " + speed + " km/h.");
    }
}


class Airplane extends Transport {
    Airplane(String name, int speed) {
        super(name, speed);
    }

    @Override
    void move() {
        System.out.println(name + " is flying in the sky at " + speed + " km/h.");
    }
}