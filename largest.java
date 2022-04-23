import java.util.Scanner;

public class largest {
    public static void main(String[] args) {
        int a[]=new int[10];
        Scanner s=new scanner(System.in);
        System.out.println("Enter the elments of array");
        for(i=0;i<10;i++){
            System.out.println("enter the"+i+"value:");
            a[i]=s.nextInt();
        }
        System.out.println("Number are:");
        for(i=0;i<10;i++){
            System.out.println(a[i]);
        }
        int max=a[0];
        for(int i=1;i<10;i++){
           if(a[i]>max){
               max=a[i];
           }
        }
        System.out.println("largest no is:"+max);
    }
}
