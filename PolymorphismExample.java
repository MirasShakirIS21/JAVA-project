class Person {
    String name;
    int age;

    void displayInfo() {
        System.out.println("name: " + name);
        System.out.println("age: " + age);
    }
}

class Student extends Person {
    String group;

    @Override
    void displayInfo() {
        System.out.println("name: " + name);
        System.out.println("age: " + age);
        System.out.println("group: " + group);
    }
}

public class PolymorphismExample {
    public static void main(String[] args) {
        Person person = new Student(); 

        person.name = "miras";
        person.age = 20;
        ((Student) person).group = "is-21";

        person.displayInfo(); 
    }
}
