class print extends Thread {
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("@");
    }
}
}
class tread{
    public static void main(String args[]){
        print t1=new print();
        print t2=new print();
        t1.start();
        t2.start();
    }
    
}
