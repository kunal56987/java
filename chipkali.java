abstract class chipkali{  
    abstract void eat();
    abstract void sound();  
  }  
  class TestAnonymousInner{  
   public static void main(String args[]){  
    chipkali p=new chipkali(){  
    void eat(){
        System.out.println("eat insects");
    } 
    void sound(){
        System.out.println("tier..tier....");
    } 
    };  
    p.eat(); 
    p.sound();
   }  
  }  
