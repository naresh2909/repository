  package firstpro.java;

import java.util.HashSet;
import java.util.Iterator;

public class Hashdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> h=new HashSet<String>();
		h.add("volleyball");
		h.add("basketball");
		h.add("handball");
		h.add("volleyball");
		System.out.println(h);
		Iterator itr=h.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		

	}

}
