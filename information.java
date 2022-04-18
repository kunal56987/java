class Student1{
    int rollno;
    String name;
    static String college="NIT";
    static void change(){
        college="Nalanda Institute of Technology";
    }
    Student1(int r,String n){
        rollno=r;
        name=n;
    }
    void display(){
        System.out.println(rollno+" "+name+" "+college);
    }
}
class information{
    public static void main(String args[]) {
        Student1 s1=new Student1(111,"kunal");
        Student1 s2=new Student1(222,"maatey");
        s1.display();
        s2.display();
        Student1.change();
        s1.display();
        s2.display();
        
    }
}