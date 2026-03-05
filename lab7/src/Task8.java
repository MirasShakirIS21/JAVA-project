package src;
public class Task8 {
    public static void main(String[] args) {

        double[][] A = new double[12][6];
        double[] product = new double[6];

        for(int j=0;j<6;j++)
            product[j]=1;

        for(int i=0;i<12;i++){
            for(int j=0;j<6;j++){

                A[i][j]=Math.random()*20-10;
                System.out.print(A[i][j]+" ");

                if(A[i][j]<0)
                    product[j]*=A[i][j];
            }
            System.out.println();
        }

        System.out.println("Произведение по столбцам:");
        for(int j=0;j<6;j++)
            System.out.println(product[j]);
    }
}