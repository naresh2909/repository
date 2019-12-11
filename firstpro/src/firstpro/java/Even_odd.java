package firstpro.java;
import java.util.Scanner;

public class Even_odd {
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	if(n%2==0)
	{
		System.out.println("even number");
	}
	else
	{
		System.out.println("odd number");
	}

}
}