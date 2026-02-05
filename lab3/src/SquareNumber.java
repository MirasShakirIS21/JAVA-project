import java.util.Scanner;

public class SquareNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        int square = number * number;

        System.out.println("Number square: " + square);

        scanner.close();
    }
}
