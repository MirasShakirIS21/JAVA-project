package src;
public class Task16 {

    public static int maxX(){
        int[] a=new int[10];

        for(int i=0;i<10;i++){
            a[i]=(int)(Math.random()*100);
            System.out.print(a[i]+" ");
        }

        int max=a[0];

        for(int i=1;i<10;i++)
            if(a[i]>max)
                max=a[i];

        return max;
    }

    public static void main(String[] args) {
        System.out.println("\nМаксимальный элемент: "+maxX());
    }
}