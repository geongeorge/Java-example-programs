class Mythread implements Runnable {
	public void run(){  
		System.out.println("thread is running...");  
	}  
}

public class Mythread1 {
	public static void main(String args[]){  
	Mythread m1=new Mythread();   
	Thread t1 =new Thread(m1);  
	Thread t2 =new Thread(m1);  
	t1.start();  
	t2.start();  
 }
}