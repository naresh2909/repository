package firstpro.java;
import java.util.Scanner;

public class Rectangle1 extends RectangleArea{
	void display()
	{
		System.out.println(width*height);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RectangleArea a=new Rectangle1();
		a.read_input();
		a.display();
	}
}


	class RectangleArea 
	{
		int width,height;
		void read_input()
		{
		Scanner s=new Scanner(System.in);
		width=s.nextInt();
		height=s.nextInt();
			
		}
		void display()
		{
			System.out.println("width"+width +"height"+height); 
		}
		
		
		
	
		

	}


