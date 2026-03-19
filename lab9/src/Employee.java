class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    void work() {
        System.out.println(name + " is working.");
    }
}

class Manager extends Employee {
    Manager(String name, double salary) {
        super(name, salary);
    }

    @Override
    void work() {
        System.out.println(name + " manages the team.");
    }
}

class Developer extends Employee {
    Developer(String name, double salary) {
        super(name, salary);
    }

    @Override
    void work() {
        System.out.println(name + " writes code.");
    }
}

class Designer extends Employee {
    Designer(String name, double salary) {
        super(name, salary);
    }

    @Override
    void work() {
        System.out.println(name + " designs interfaces.");
    }
}