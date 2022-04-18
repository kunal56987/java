class student{
    int roll_no;
    String name;
    void insertRecord(int r, String n){
        roll_no=r;
        name=n;
    }
    void display(){
        System.out.println(roll_no+" "+name);
    }
}
class teast {
    public static void main(String args[]){
        student s1=new student();
        student s2=new student();
        s1.insertRecord(101,"kunal");
        s2.insertRecord(102,"maatey");
        s1.display();
        s2.display();
    }
}