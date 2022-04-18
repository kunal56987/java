//Q4 wap using member inner class(non static inner class)


class data{  
 private int data=30;  
 class display{  
  void msg(){System.out.println("data is "+data);}  
 }  
 public static void main(String args[]){  
  data obj=new data();  
  data.display in=obj.new display();  
  in.msg();  
 }  
}  