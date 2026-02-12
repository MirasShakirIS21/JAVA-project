import java.util.Scanner;

public class NumberRange {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Введите число: ");
            int number = scanner.nextInt();

            if (number >= 10 && number <= 50) {
                System.out.println("Число входит в диапазон 10-50");
            } else {
                System.out.println("Число не входит в диапазон");
            }
        }
    }
}
