package firstpro.java;
import java.util.Scanner;

public class Alpha {
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	String str=s.nextLine();
	String str1=str.toLowerCase();
		char[] ch=str.toCharArray();
	
	if((ch[0]>=0)||(ch[0]<0))
	{
		System.out.println("Error 1");
	}
	for(int i=0;i<ch.length;i++)
	{
		if(ch[i+1]>='a' && ch[i+1]<='z')
		{
			System.out.println("No Error");
		}
		else
		{
			System.out.println("Error 2");
		}
	}

}
}
