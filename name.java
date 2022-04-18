//Q3 wap using inner class to display your name using inner class method

import java.util.*;
class name{
    private String Name;
    class displayName{
        void name(){
            Scanner s=new Scanner(System.in);
            System.out.print("Enter your name:");
            Name=s.nextLine();
            System.out.println("your name is: "+Name);
        }

    }
    public static void main(String agrs[]) {
        name n=new name();
        name.displayName ds=n.new displayName();
        ds.name();
        
    }

}