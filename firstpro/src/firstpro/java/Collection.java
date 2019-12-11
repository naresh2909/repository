package firstpro.java;

import java.util.ArrayList;
import java.util.Iterator;

public class Collection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al=new ArrayList();
		al.add("ipl");
		al.add("mumbai");
		al.add("indians");
		System.out.println(al);
		al.remove(1);
		System.out.println(al);
		al.add("champions");
		Iterator itr=al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

	}

}

