import java.util.Scanner;

class Evenodd {
    void FindEvenodd(int n){
        if(n%2==0){
            System.out.println(n+"is even");
        }
        else{
            System.out.println(n+"is odd");
        }
    }
    public static void main(String args[]) {
        Scanner s=new Scanner(System.in);
        Evenodd e=new Evenodd();
        System.out.println("Enter the no:");
        int num = s.nextInt();
        e.FindEvenodd(num);
    } 
}
