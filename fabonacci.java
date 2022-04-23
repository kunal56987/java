
class fabonacci{
public static void main(String args[]){
int f=1,s=1,t,i;
System.out.println(f);
System.out.println(s);
for(i=3;i<=10;i++){
t=f+s;
System.out.println(t);
f=s;
s=t;
}
}
}
