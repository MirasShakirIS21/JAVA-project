import java.util.Scanner;

public class TemperatureCheck {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Введите температуру: ");
            int temp = scanner.nextInt();

            if (temp < 0) {
                System.out.println("Холодно");
            } else if (temp <= 25) {
                System.out.println("Тепло");
            } else {
                System.out.println("Жарко");
            }
        }
    }
}
