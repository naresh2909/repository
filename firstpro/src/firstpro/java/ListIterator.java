package firstpro.java;

public class ListIterator {
	 public static void main(String args[]) 
	 {
	 ListIterator a = list.listIterator();
	 if(a.previousIndex()! = -1)
	while(a.hasNext())
	System.out.print(a.next() + " ");
	else
	System.out.print("EMPTY");
	}
	}

}
