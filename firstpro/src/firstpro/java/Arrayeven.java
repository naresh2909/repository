package firstpro.java;

import java.util.ArrayList;
import java.util.Iterator;

public class Arrayeven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		ArrayList al=new ArrayList();
		for(int i=1;i<=100;i++)
		{
			al.add(i);
		}
		System.out.println(al);
		Iterator itr=al.iterator();
		while(itr.hasNext())
				{
			int a=(int)itr.next();
			if(a%2==0)
			sum=sum+a;
			
				}
		System.out.println(sum);
	}

}
