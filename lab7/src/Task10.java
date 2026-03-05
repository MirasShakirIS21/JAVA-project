package src;
public class Task10 {
    public static void main(String[] args) {

        int[][] D = new int[7][7];
        int sum = 0;

        for(int i=0;i<7;i++){
            for(int j=0;j<7;j++){
                D[i][j]=(int)(Math.random()*20);
                System.out.print(D[i][j]+" ");

                if(i==j)
                    sum+=D[i][j];
            }
            System.out.println();
        }

        System.out.println("Среднее: "+(double)sum/7);
    }
}