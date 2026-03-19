// Базовый класс
class Person {
    String name;

    Person(String name) {
        this.name = name;
    }

    void study() {
        System.out.println(name + " is studying.");
    }

    void teach() {
        System.out.println(name + " is teaching.");
    }

    void manage() {
        System.out.println(name + " is managing the school.");
    }

    public static void main(String[] args) {
        Person student = new Student("Alice");
        Person teacher = new Teacher("Bob");
        Person admin = new Administrator("Charlie");

        student.study();
        teacher.teach();
        admin.manage();
    }
}

// Производный класс Student
class Student extends Person {
    Student(String name) {
        super(name);
    }

    @Override
    void study() {
        System.out.println(name + " is studying at university.");
    }
}

// Производный класс Teacher
class Teacher extends Person {
    Teacher(String name) {
        super(name);
    }

    @Override
    void teach() {
        System.out.println(name + " is teaching students.");
    }
}

// Производный класс Administrator
class Administrator extends Person {
    Administrator(String name) {
        super(name);
    }

    @Override
    void manage() {
        System.out.println(name + " is managing the university.");
    }
}