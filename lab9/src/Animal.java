// Базовый класс
class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }

    void makeSound() {
        System.out.println(name + " makes a sound.");
    }

    public static void main(String[] args) {
        Animal lion = new Lion("Leo");
        Animal elephant = new Elephant("Ella");
        Animal monkey = new Monkey("Momo");

        lion.makeSound();
        elephant.makeSound();
        monkey.makeSound();
    }
}

// Производный класс Lion
class Lion extends Animal {
    Lion(String name) {
        super(name);
    }

    @Override
    void makeSound() {
        System.out.println(name + " roars: Roarrr!");
    }
}

// Производный класс Elephant
class Elephant extends Animal {
    Elephant(String name) {
        super(name);
    }

    @Override
    void makeSound() {
        System.out.println(name + " trumpets: Pawoo!");
    }
}

// Производный класс Monkey
class Monkey extends Animal {
    Monkey(String name) {
        super(name);
    }

    @Override
    void makeSound() {
        System.out.println(name + " chatters: Ooh ooh aah aah!");
    }
}