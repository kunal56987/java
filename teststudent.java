import java.lang.*;
class student{
int rollno,marks;
Long phno;
String name;
void insert(String n,int r,int m,Long p){
name=n;
rollno=r;
marks=m;
phno=p;
}
void display(){
System.out.println(name+" "+rollno+" "+marks+" "+phno);
}
}
public class teststudent{
public static void main(String args[]){
student s1=new student();
student s2=new student();
s1.insert("aman",201,506,8906567890);
s2.insert("lp",202,450,7845638905);
s1.display();
s2.display();
}
}