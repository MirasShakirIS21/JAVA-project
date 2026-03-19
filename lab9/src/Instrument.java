// Базовый класс
class Instrument {
    String name;

    Instrument(String name) {
        this.name = name;
    }

    void playSound() {
        System.out.println(name + " is playing a sound.");
    }

    public static void main(String[] args) {
        Instrument guitar = new Guitar("Gibson");
        Instrument piano = new Piano("Yamaha");
        Instrument drums = new Drums("Pearl");

        guitar.playSound();
        piano.playSound();
        drums.playSound();
    }
}

// Производный класс Guitar
class Guitar extends Instrument {
    Guitar(String name) {
        super(name);
    }

    @Override
    void playSound() {
        System.out.println(name + " guitar strums chords.");
    }
}

// Производный класс Piano
class Piano extends Instrument {
    Piano(String name) {
        super(name);
    }

    @Override
    void playSound() {
        System.out.println(name + " piano plays melodies.");
    }
}

// Производный класс Drums
class Drums extends Instrument {
    Drums(String name) {
        super(name);
    }

    @Override
    void playSound() {
        System.out.println(name + " drums beat rhythmically.");
    }
}