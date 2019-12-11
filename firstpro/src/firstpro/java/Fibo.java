package firstpro.java;
import java.util.Scanner;

public class Fibo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c, a=0,b=1,count=2;
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		while(count>=n)
		{
			c=a+b;
			a=b;
			b=c;
			System.out.println(c);
			count++;
		}
		
		


	}

}
