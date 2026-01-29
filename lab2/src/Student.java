public class Student extends Person {
    String group;

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("name: " + name);
        System.out.println("age: " + age);
        System.out.println("group: " + group);
    }
}
