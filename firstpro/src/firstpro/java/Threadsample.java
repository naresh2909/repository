package firstpro.java;

public class Threadsample {

	public static void main(String[] args) throws InterruptedException {
		Cube t1=new Cube();
		Square t2=new Square();
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		Thread.currentThread().setName("Thread-1");
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getPriority());
		System.out.println(Thread.currentThread().MAX_PRIORITY);
		System.out.println(Thread.currentThread().MIN_PRIORITY);
		System.out.println(Thread.currentThread().NORM_PRIORITY);
		for(int i=0;i<10;i++)
		{
			System.out.println(i);
		}
	}
}
 class Cube extends Thread{
	 public void run() {
		 for(int i=0;i<10;i++)
		 {
			 System.out.println("cube of"+i);
			 try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		 }
	 }	
}
 class Square extends Thread{
	 public void run() {
		 for(int i=0;i<10;i++)
		 {
			 System.out.println("square of"+i);
		 }
	 }
 }

