
import java.util.*;
class percentage{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
System.out.println("enter marks of following subject");
System.out.print("maths:");
int m=s.nextInt();
System.out.print("English:");
int e=s.nextInt();
System.out.print("science:");
int sc=s.nextInt();
System.out.print("Socieal science:");
int ss=s.nextInt();
System.out.print("IT:");
int I=s.nextInt();
float avg=(m+e+sc+ss+I)/5;
System.out.println("perentege="+avg);
}
}