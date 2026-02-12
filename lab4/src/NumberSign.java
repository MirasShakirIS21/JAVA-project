import java.util.Scanner;

public class NumberSign {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Введите целое число: ");

            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();

                if (number > 0) {
                    System.out.println("Число положительное");
                } else if (number < 0) {
                    System.out.println("Число отрицательное");
                } else {
                    System.out.println("Число равно нулю");
                }
            } else {
                System.out.println("Ошибка: нужно ввести целое число.");
            }
        }
    }
}
