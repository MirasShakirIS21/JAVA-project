import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {

    static class Student {
        String name;
        int age;
        double grade;

        Student(String name, int age, double grade) {
            this.name = name;
            this.age = age;
            this.grade = grade;
        }

        public String toString() {
            return name + " " + age + " " + grade;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> nums = Arrays.asList(1,2,3,4,5);
        List<String> list = Arrays.asList("Java", "Stream", "Programming");

        List<Student> students = Arrays.asList(
                new Student("Ali", 20, 85),
                new Student("Dana", 22, 75),
                new Student("Max", 21, 90)
        );

        System.out.print("Введите номер задания (1-20): ");
        int choice = sc.nextInt();

        switch (choice) {

            case 1:
                BinaryOperator<Integer> sum = (a, b) -> a + b;
                System.out.println(sum.apply(5, 3));
                break;

            case 2:
                Function<String, String> toUpper = s -> s.toUpperCase();
                System.out.println(toUpper.apply("hello"));
                break;

            case 3:
                nums.stream().filter(n -> n % 2 != 0)
                        .forEach(System.out::println);
                break;

            case 4:
                nums.stream().map(n -> n * n)
                        .forEach(System.out::println);
                break;

            case 5:
                System.out.println(nums.stream()
                        .max(Integer::compare).orElse(0));
                break;

            case 6:
                list.stream()
                        .sorted(Comparator.comparing(String::length))
                        .forEach(System.out::println);
                break;

            case 7:
                Function<String, String> cap =
                        s -> s.substring(0,1).toUpperCase() + s.substring(1);
                System.out.println(cap.apply("java"));
                break;

            case 8:
                list.stream()
                        .filter(s -> s.length() > 5)
                        .forEach(System.out::println);
                break;

            case 9:
                nums.forEach(System.out::println);
                break;

            case 10:
                System.out.println(nums.stream()
                        .min(Integer::compare).orElse(0));
                break;

            case 11:
                Consumer<String> printer = System.out::println;
                printer.accept("Hello");
                break;

            case 12:
                Supplier<Integer> random = () -> new Random().nextInt(100);
                System.out.println(random.get());
                break;

            case 13:
                students.stream()
                        .sorted(Comparator.comparing(s -> s.age))
                        .forEach(System.out::println);
                break;

            case 14:
                students.stream()
                        .filter(s -> s.grade > 80)
                        .sorted(Comparator.comparing(s -> s.name))
                        .forEach(System.out::println);
                break;

            case 15:
                nums.stream()
                        .filter(n -> n > 2)
                        .map(n -> n * 2)
                        .sorted()
                        .forEach(System.out::println);
                break;

            case 16:
                Map<Integer, List<Student>> grouped =
                        students.stream()
                                .collect(Collectors.groupingBy(s -> s.age));
                System.out.println(grouped);
                break;

            case 17:
                System.out.println(nums.stream()
                        .reduce(0, Integer::sum));
                break;

            case 18:
                List<Integer> numbers = Arrays.asList(1,2,2,3,3,4,5);
                numbers.stream()
                        .distinct()
                        .limit(3)
                        .forEach(System.out::println);
                break;

            case 19:
                List<List<Integer>> nested = Arrays.asList(
                        Arrays.asList(1,2),
                        Arrays.asList(3,4)
                );
                nested.stream()
                        .flatMap(List::stream)
                        .forEach(System.out::println);
                break;

            case 20:
                List<Integer> orders = Arrays.asList(500, 2000, 1500, 700);
                orders.stream()
                        .filter(o -> o > 1000)
                        .sorted()
                        .forEach(System.out::println);
                break;

            default:
                System.out.println("Неверный номер!");
        }
    }
}