package firstpro.java;
import java.util.Scanner;

public class Customer {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str = null;
		do {
		System.out.println("Enter your choice :");
		System.out.println("1.Display room details");
		System.out.println("2.Display room availability" );
		System.out.println("3. Book");
		System.out.println("4.Order food");
		System.out.println("5.Checkout");
		System.out.println("6.Exit");
		
		int choice=s.nextInt();
		
		switch(choice) {
		case 1:
		{
			System.out.println("Choose room type :");
			System.out.println("1. Luxury Double Room ");
			System.out.println("2.Deluxe Double Room ");
			System.out.println("3. Luxury Single Room ");
			System.out.println("4.Deluxe Single Room");
		int room_type=s.nextInt();
		switch(room_type)
		{
		case 1:
		{
			System.out.println("Number of double beds :2" );
					System.out.println("AC : Yes");
					System.out.println("Free breakfast : Yes");
					System.out.println("Charge per day:4000 ");
					break;
		}
		case 2:
		{
			System.out.println("Number of double beds :1" );
					System.out.println("AC : Yes");
					System.out.println("Free breakfast : Yes");
					System.out.println("Charge per day:3500 ");
					break;
		}
		case 3:
		{
			System.out.println("Number of double beds :1" );
					System.out.println("AC : no");
					System.out.println("Free breakfast : Yes");
					System.out.println("Charge per day:3000 ");
					break;
		}
		case 4:
		{
			System.out.println("Number of double beds :1" );
					System.out.println("AC : no");
					System.out.println("Free breakfast : no");
					System.out.println("Charge per day:2000 ");
					break;
		}
		}
		System.out.println("Continue : (y/n)");
		str=s.next();
		}
		case 2:
		{
			System.out.println("Number of rooms available : 20");
			System.out.println("Continue : (y/n)");
			str=s.next();
			break;
		}
		case 3:
		{
			System.out.println("Choose room number from : \r\n" + 
					"1,2,3,4,5,6,7,8,9,10,\r\n" + 
					"");
			System.out.println("Enter room number: ");
			int room=s.nextInt();
			System.out.println("Enter customer name: \n" );
			s.next();
			System.out.println("Enter contact number: \n" );
			s.nextLong();
			System.out.println("Continue : (y/n)");
			str=s.next();
			break;
		}
		case 4:
		{
		System.out.println("==========");
		System.out.println("Menu:");
		System.out.println("==========");
		System.out.println("1. Sandwich Rs.50");
		System.out.println("2. Pasta Rs.60");
		System.out.println("3. Noodles Rs.70");
		System.out.println("4. Coke Rs.30");
		System.out.println("Continue : (y/n)");
		str=s.next();
		break;
		}
		
		
		}
		
	}while(str.equals("y"));
	

}
}
