package firstpro.java;
import java.util.Scanner;
public class Array {
	
	public static void main(String[] args)
	{
		int n,i;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		int arr[]=new int[n];
		for(i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		int lar=arr[0];
		for(i=1;i<=n;i++) {
		if(arr[i]>lar)
		{
			int res=arr[i];
			lar=res;
		}
		}
		for(i=0;i<n;i++) {
			if((arr[i]*arr[i+1])==lar)
			{
				System.out.println(lar);
			}
			else
			{
				System.out.println("-1");
			}
		}
		}
}	


