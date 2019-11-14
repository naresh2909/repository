package firstpro.java;
import java.util.Scanner;

public class Cricket {
	public static void main(String[] args) {
	
	double x,y,z;
	Scanner s = new Scanner(System.in);
	x=s.nextInt();
	y=s.nextInt();
	z=s.nextInt();
	double res,runs;
	res=((4*y)+(6*z));
	runs=x-res;
	double per=(runs*100/x);
	System.out.println(per);
	
	
	
	
	
	
	}
}
