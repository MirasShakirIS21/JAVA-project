// Базовый класс
class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // Метод work (по умолчанию)
    void work() {
        System.out.println(name + " is working.");
    }

    // Метод main внутри Employee
    public static void main(String[] args) {
        // Создаем объекты
        Employee manager = new Manager("Alice", 5000);
        Employee developer = new Developer("Bob", 4000);
        Employee designer = new Designer("Charlie", 3500);

        // Вызываем метод work для каждого сотрудника
        manager.work();
        developer.work();
        designer.work();
    }
}

// Производный класс Manager
class Manager extends Employee {
    Manager(String name, double salary) {
        super(name, salary);
    }

    @Override
    void work() {
        System.out.println(name + " is managing the team.");
    }
}

// Производный класс Developer
class Developer extends Employee {
    Developer(String name, double salary) {
        super(name, salary);
    }

    @Override
    void work() {
        System.out.println(name + " is writing code.");
    }
}

// Производный класс Designer
class Designer extends Employee {
    Designer(String name, double salary) {
        super(name, salary);
    }

    @Override
    void work() {
        System.out.println(name + " is designing a product.");
    }
}