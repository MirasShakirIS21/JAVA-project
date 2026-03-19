// Базовый класс
class Product {
    String name;
    double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    void showPrice() {
        System.out.println(name + " costs $" + price);
    }

    public static void main(String[] args) {
        Product food = new Food("Bread", 2.5);
        Product electronics = new Electronics("Smartphone", 799);
        Product clothes = new Clothes("T-shirt", 20);

        food.showPrice();
        electronics.showPrice();
        clothes.showPrice();
    }
}

// Производный класс Food
class Food extends Product {
    Food(String name, double price) {
        super(name, price);
    }

    @Override
    void showPrice() {
        System.out.println("Food: " + name + " costs $" + price);
    }
}

// Производный класс Electronics
class Electronics extends Product {
    Electronics(String name, double price) {
        super(name, price);
    }

    @Override
    void showPrice() {
        System.out.println("Electronics: " + name + " costs $" + price);
    }
}

// Производный класс Clothes
class Clothes extends Product {
    Clothes(String name, double price) {
        super(name, price);
    }

    @Override
    void showPrice() {
        System.out.println("Clothing: " + name + " costs $" + price);
    }
}