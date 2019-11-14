package firstpro.java;

import java.util.Scanner;
class Dice
{
public static void main(String[] args)
{
Scanner s =new Scanner(System.in);
int n1,n2;
n1=s.nextInt();
n2=s.nextInt();
if((n1<0)||(n1>6))
{
System.out.println("invalid");
}
else if((n2<0)||(n2>6))
{
System.out.println("invalid");
}
else if(n1==n2)
{
System.out.println((n1+n2)*2);
}

else
{
System.out.println(n1+n2);
}
}
}

