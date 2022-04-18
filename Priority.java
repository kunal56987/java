class Priority extends Thread{  
public void run(){ 
System.out.println("Inside the run() method");  
} 
public static void main(String argvs[]){ 
Priority t1 = new Priority();  
Priority t2 = new Priority(); 
Priority t3 = new Priority();  
System.out.println("Priority of the thread t1 is : " + t1.getPriority());   
System.out.println("Priority of the thread t2 is : " + t2.getPriority());   
System.out.println("Priority of the thread t2 is : " + t2.getPriority());  
t1.setPriority(3);  
t2.setPriority(2);  
t3.setPriority(1);  
System.out.println("Priority of the thread t1 is : " + t1.getPriority());   
System.out.println("Priority of the thread t2 is : " + t2.getPriority());  
System.out.println("Priority of the thread t3 is : " + t3.getPriority());  
System.out.println("Currently Executing The Thread : " + Thread.currentThread().getName());  
System.out.println("Priority of the main thread is : " + Thread.currentThread().getPriority());  
Thread.currentThread().setPriority(10);  
System.out.println("Priority of the main thread is : " + Thread.currentThread().getPriority());  
}  
}  