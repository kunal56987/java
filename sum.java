import java.util.*;

class sum{
    public static void main(String[] args){
        int a,b,c,sum;
        Scanner s=new Scanner(System.in);
        System.out.print("enter the value of a:");
        a=s.nextInt();
        System.out.print("enter the value of b:");
        b=s.nextInt();
        System.out.print("enter the value of c:");
        c=s.nextInt();
        sum=a+b+c;
        System.out.println("sum of three no is "+sum);
    }
}