package firstpro.java;

public class Thresddemo extends Thread {
	public void run(){
		System.out.println("inside class");
	}
	
	

	public static void main(String[] args) {
		
		Thresddemo t1=new Thresddemo();
		Thresddemo t2=new Thresddemo();
		t1.start();
		t2.start();
		
		
		

	}

}
