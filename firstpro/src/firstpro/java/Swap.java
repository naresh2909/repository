package firstpro.java;
import java.util.Scanner; 

public class Swap {
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int n1=s.nextInt();
	int n2=s.nextInt();
	System.out.println("before swapping n1="+n1 +"n2 = " +n2);
	int n3=n1;
	n1=n2;
	n2=n3;
	System.out.println("after swapping n1="+n1 +"n2 = " +n2);
	
	

}
}
