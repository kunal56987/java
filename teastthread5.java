class testThread5 extends Thread{
    public void run(){
        System.out.println("i am a thread");
    }
    public static void main(String args[]){
        testThread5 t1=new testThread5();
        t1.start();
        testThread5 t2=new testThread5();
        t2.start();
    }
}