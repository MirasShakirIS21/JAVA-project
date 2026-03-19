// Базовый класс
class Character {
    String name;

    Character(String name) {
        this.name = name;
    }

    void attack() {
        System.out.println(name + " attacks!");
    }

    public static void main(String[] args) {
        Character warrior = new Warrior("Conan");
        Character mage = new Mage("Gandalf");
        Character archer = new Archer("Legolas");

        warrior.attack();
        mage.attack();
        archer.attack();
    }
}

// Производный класс Warrior
class Warrior extends Character {
    Warrior(String name) {
        super(name);
    }

    @Override
    void attack() {
        System.out.println(name + " swings a sword!");
    }
}

// Производный класс Mage
class Mage extends Character {
    Mage(String name) {
        super(name);
    }

    @Override
    void attack() {
        System.out.println(name + " casts a fireball!");
    }
}

// Производный класс Archer
class Archer extends Character {
    Archer(String name) {
        super(name);
    }

    @Override
    void attack() {
        System.out.println(name + " shoots an arrow!");
    }
}