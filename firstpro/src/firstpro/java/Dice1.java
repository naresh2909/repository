package firstpro.java;

import java.util.Scanner;

class Dice1
{
public static void main(String[] args)
{
Scanner s =new Scanner(System.in);
int n1,n2,n3;
n1=s.nextInt();
n2=s.nextInt();
if((n1>=0)||(n1<=6)) {
	if((n2>=0)||(n2<=6))
{
	if((n1+n2)>8)
	{
		System.out.println(((n1+n2)-8)*2);
	}
	else
	{
		System.out.println(8-(n1+n2));
	}
	
}
}
else
	System.out.println("invalid");
}
}