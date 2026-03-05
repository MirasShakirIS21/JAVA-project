package src;
public class Task5 {
    public static void main(String[] args) {
        int[] D = new int[17];
        int sum = 0;

        for (int i = 0; i < 17; i++) {
            D[i] = (int)(Math.random()*20);
            System.out.print(D[i] + " ");
            sum += D[i];
        }

        double avg = (double)sum / 17;
        System.out.println("\nСреднее: " + avg);
    }
}