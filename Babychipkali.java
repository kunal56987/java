interface ligard{
    void eat();
}
interface chipkali extends ligard{
   void sound();
}
class bchipkali implements chipkali {
   public void eat() {
      System.out.println("eat insects");
   }
   public void sound() {
      System.out.println("Tier...tier...");
   }
}
public class Babychipkali{
       public static void main(String args[]) {
      bchipkali c = new bchipkali();
      c.eat();
      c.sound();
   }
}