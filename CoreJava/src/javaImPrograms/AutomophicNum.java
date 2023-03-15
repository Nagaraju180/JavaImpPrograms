package javaImPrograms;

import java.util.Scanner;

public class AutomophicNum {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number:");
		int num=sc.nextInt();
		
		if(num<0)System.out.println("No negitives");
		else
		{
			int len=length(num);
			int sqrNum=power(num,2);
			int result=sqrNum%power(10,len);
			
			if(num==result)System.out.println("Automophic Number");
			else System.out.println("Not a Automophic Number");
		}

	}
	public static int length(int num)
	{
		int count=0;
		
		while(num!=0)
		{
			count++;
		    num/=10;
		}
		return count;
		
	}
	public static int power(int base,int exp)
	{
		int res=1;
		for(int i=1;i<=exp;i++)
		{
			res=res*base;
		}
		return res;
	}

}
