package firstpro.java;
import java.util.Scanner;

public class Atm {
	public static void main(String[] args) {
	int pin=1520,n,choice,balance=1000,withdraw,deposit ;
	Scanner s=new Scanner(System.in);
	System.out.println("ENTER YOUR SECRET PIN NUMBER");
	n=s.nextInt();
	if(pin==n)
	{
		System.out.println("********Welcome to ATM Service**************");
		System.out.println("1.check balance");
		System.out.println("2.withdraw cash");
		System.out.println("3.deposit cash");
		System.out.println("4.quit");
		System.out.println("******************?**************************");
		System.out.println("enter your choice");
		choice=s.nextInt();
		switch(choice)
		{
		case 1:
		{
			System.out.println(balance);
			break;
		}
		case 2:
		{
			System.out.println("ENTER THE AMOUNT TO WITHDRAW");
			withdraw=s.nextInt();
			if(balance>withdraw)
			{
				System.out.println("please collect cash");
				balance=balance-withdraw;
				System.out.println("YOUR CURRENT BALANCE IS" +balance);
				break;
				
			}
			else {
				System.out.println("balance is low");
			}
		}
		case 3:
		{
			System.out.println("ENTER THE AMOUNT TO DEPOSIT");
			deposit=s.nextInt();
			balance=balance+deposit;
			System.out.println("YOUR BALANCE IS "+balance);
			break;
		}
		case 4:
		{
			System.out.println("THANK U USING ATM");
			break;
		}
		
		}
		}
	else {
		System.out.println("Invalid pin");
	}
	}	

}
