// Базовый класс
class TeamMember {
    String name;

    TeamMember(String name) {
        this.name = name;
    }

    void play() {
        System.out.println(name + " is playing.");
    }

    void train() {
        System.out.println(name + " is training.");
    }

    void heal() {
        System.out.println(name + " is healing.");
    }

    public static void main(String[] args) {
        TeamMember player = new Player("John");
        TeamMember coach = new Coach("Mike");
        TeamMember doctor = new Doctor("Sarah");

        player.play();
        coach.train();
        doctor.heal();
    }
}

// Производный класс Player
class Player extends TeamMember {
    Player(String name) {
        super(name);
    }

    @Override
    void play() {
        System.out.println(name + " is playing on the field.");
    }
}

// Производный класс Coach
class Coach extends TeamMember {
    Coach(String name) {
        super(name);
    }

    @Override
    void train() {
        System.out.println(name + " is training the team.");
    }
}

// Производный класс Doctor
class Doctor extends TeamMember {
    Doctor(String name) {
        super(name);
    }

    @Override
    void heal() {
        System.out.println(name + " is treating injured players.");
    }
}