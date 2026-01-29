
public class PolymorphismExample {
    public static void main(String[] args) {
        Person person = new Student(); 

        person.name = "miras";
        person.age = 20;
        ((Student) person).group = "is-21";

        person.displayInfo(); 
    }
}
