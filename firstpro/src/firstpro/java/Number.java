package firstpro.java;
import java.util.Scanner;

public interface Sample {
	public void add();
}
	 class Greater implements Sample{
		public void add() {
			Scanner s=new Scanner(System.in);
			int a=s.nextInt();
			int b=s.nextInt();
			int c;
			c=a+b;
			System.out.println(c);
		}
		
	}
	class Number{
	public static void main(String[] args) {
		Greater g=new Greater();
		g.add();
		
	}
	}
	


