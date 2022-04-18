

class methodoverloading{
    String name;
    static String clg_name="NIT";
    int reg_no;
    long mob_no;
    String Branch;
    long account_no;
    void studentDeatiles(String name,int reg_no){
        this.name=name;
        this.reg_no=reg_no;
    }
    void studentDeatiles(String Branch){
        this.Branch=Branch;
    }
    void displayStudentDetails(){
        System.out.println(name+" "+reg_no+" "+Branch+" "+clg_name);
    }
}
class studentdeatiles{
    public static void main(String args[]) {
    methodoverloading m=new methodoverloading();
    m.studentDeatiles("kunal",2001297136);
    m.studentDeatiles("CSE");
    m.displayStudentDetails();
}
}