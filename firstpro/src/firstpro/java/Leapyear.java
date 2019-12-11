package firstpro.java;
import java.util.Scanner;

public class Leapyear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		if(n%4==0)
		{
			if(n%400==0&&n%100==0)
			{
				System.out.println("leapyear");
			}
		}
			else
			{
				System.out.println("not a leap year");

			}
		

	}

}
