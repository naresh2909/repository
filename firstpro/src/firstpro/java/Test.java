package firstpro.java;

public class Test {
	
	int sum=0;
	static void add(int...a)
	{Test t=new Test();
		for(int i:a) {
			t.sum+=i;
			System.out.println(t.sum);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		add(1,2);

	}

}
