package firstpro.java;

import java.util.ArrayList;
import java.util.Scanner;
 class Priority{
	private int id;
	private String name;
	private double cgpa;
	public Priority(int id,String name,double cgpa)
	{
		this.id=id;
		this.name=name;
		this.cgpa=cgpa;
		
	}
	public int getid()
	{
		return id;
	}
	public String getname()
	{
		return name;
	}
	public double getcgpa()
	{
		return cgpa;
	}
	public int compareTo(Priority p)
	{
		if(this.cgpa<p.cgpa)
		{
			return -1;
		}
		else if(this.cgpa>p.cgpa)
		{
			return 1;
		}
		if(this.name.compareTo(p.name)<0)
		{
			return -1;
		}
		else if(this.name.compareTo(p.name)>0)
		{
			return 1;
		}
		else
		{
			if(this.id<p.id)
			{
				return -1;
			}
		}
		
		return 1;
	}
}
public class Student {
	
	public static void insert(Priority p)
	{
		int pos=0;
		for(int i=0;i<arr.size();i++)
		{
			if(arr.get(pos).compareTo(p)>0) {
				pos++;
				
			}
			else
			{
				break;
			}
		}
		arr.add(pos,p);
	}

public static ArrayList<Priority> arr=new ArrayList<>();
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int n=0;
		String name="";
		double cgpa=0;
		System.out.println("Enter the Event size");
		int eventNo=s.nextInt();
		while(eventNo>0) {
		System.out.println("Enter the event type:");
		String str=s.next();
		if(str.equals("enter")) {
			System.out.println("Enter id");
			n=s.nextInt();
			System.out.println("Enter name");
			name=s.next();
			System.out.println("Enter cgpa");
			cgpa=s.nextDouble();
		}
		else if((str.toLowerCase()).equals("served"))
		{
			if(!arr.isEmpty()) {
				arr.remove(0);
			}
			else
			{
				Priority p=new Priority(n,name,cgpa);
				insert(p);
				
			}
			
		}
		eventNo--;
		}
		if(arr.size()>0) {
			for(int i=0;i<arr.size();i++) {
				System.out.println(arr.get(i).getname());
			}
		}
		else {
			System.out.println("Empty Queue");
		}
	}
}
