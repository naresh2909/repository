package firstpro.java;
import java.util.Scanner;

public class Interest {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		float a;
		int b,c;
		a=s.nextFloat();
		b=s.nextInt();
		c=s.nextInt();
		int e=0;
		while(a<c)
			
		{
			float f=((a*b)/100);
			a=f+a;
			e++;
			
		}
		System.out.println(e);
		
	}

}
