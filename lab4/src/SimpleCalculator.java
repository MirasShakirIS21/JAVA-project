import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Введите первое число: ");
            double a = scanner.nextDouble();

            System.out.print("Введите второе число: ");
            double b = scanner.nextDouble();

            System.out.print("Введите операцию (+, -, *, /): ");
            char operation = scanner.next().charAt(0);

            switch (operation) {
                case '+':
                    System.out.println("Результат: " + (a + b));
                    break;

                case '-':
                    System.out.println("Результат: " + (a - b));
                    break;

                case '*':
                    System.out.println("Результат: " + (a * b));
                    break;

                case '/':
                    if (b != 0) {
                        System.out.println("Результат: " + (a / b));
                    } else {
                        System.out.println("Ошибка: деление на ноль!");
                    }
                    break;

                default:
                    System.out.println("Некорректная операция");
            }
        }
    }
}
