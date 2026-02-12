import java.util.Scanner;

class GradeCalculator {
     static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Введите балл (0-100): ");
            int score = scanner.nextInt();

            if (score >= 90 && score <= 100) {
                System.out.println("Оценка: 5");
            } else if (score >= 75) {
                System.out.println("Оценка: 4");
            } else if (score >= 60) {
                System.out.println("Оценка: 3");
            } else if (score >= 0) {
                System.out.println("Оценка: 2");
            } else {
                System.out.println("Некорректный ввод");
            }
        }
    }
}
