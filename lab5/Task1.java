import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число N: ");
        int n = scanner.nextInt();

        if (n < 0) {
            for (int i = n; i <= 0; i++) {
                System.out.println(i);
            }  
        }

        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
    }
}
