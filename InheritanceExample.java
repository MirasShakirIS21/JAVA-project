class Person {
    String name;
    int age;
}

class Student extends Person {
    String group;
}

public class InheritanceExample {
    public static void main(String[] args) {
        Student student = new Student();

        student.name = "miras";
        student.age = 19;
        student.group = "is-21";

        System.out.println("name: " + student.name);
        System.out.println("age: " + student.age);
        System.out.println("groupw: " + student.group);
    }
}
