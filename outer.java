//Q5 wap using static inner class to access the static member of outer class

public class outer{  
  static int data=30;  
  static class Inner{  
   static void msg(){System.out.println("data is "+data);}  
  }  
  public static void main(String args[]){  
  outer.Inner.msg();
  }  
}  