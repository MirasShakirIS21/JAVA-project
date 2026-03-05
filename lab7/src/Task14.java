package src;
public class Task14 {
    public static void main(String[] args) {

        int[] D=new int[30];
        int even=0, odd=0;

        for(int i=0;i<30;i++){
            D[i]=(int)(Math.random()*50);
            System.out.print(D[i]+" ");

            if(D[i]%2==0)
                even+=D[i];
            else
                odd+=D[i];
        }

        System.out.println("\nСумма чётных: "+even);
        System.out.println("Сумма нечётных: "+odd);
    }
}