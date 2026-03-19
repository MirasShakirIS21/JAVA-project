// Базовый класс
class Appliance {
    String brand;

    Appliance(String brand) {
        this.brand = brand;
    }

    void operate() {
        System.out.println(brand + " appliance is operating.");
    }

    public static void main(String[] args) {
        Appliance fridge = new Refrigerator("LG");
        Appliance washer = new WashingMachine("Samsung");
        Appliance microwave = new Microwave("Panasonic");

        fridge.operate();
        washer.operate();
        microwave.operate();
    }
}

// Производный класс Refrigerator
class Refrigerator extends Appliance {
    Refrigerator(String brand) {
        super(brand);
    }

    @Override
    void operate() {
        System.out.println(brand + " refrigerator is cooling food.");
    }
}

// Производный класс WashingMachine
class WashingMachine extends Appliance {
    WashingMachine(String brand) {
        super(brand);
    }

    @Override
    void operate() {
        System.out.println(brand + " washing machine is washing clothes.");
    }
}

// Производный класс Microwave
class Microwave extends Appliance {
    Microwave(String brand) {
        super(brand);
    }

    @Override
    void operate() {
        System.out.println(brand + " microwave is heating food.");
    }
}