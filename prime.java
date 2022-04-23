
class prime{
public static void main(String args[]){
int n=7,i,found=0;
for(i=2;i<n;i++){
if(n%i==0){
found=1;
break;
}
}
if(found==0){
System.out.println("it is a prime no");
}
else{
System.out.println("it is not a prime no.");
}
}
}