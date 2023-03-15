package javaImPrograms;

import java.util.Scanner;

public class Length {
	public static long length(int num)
	{
		long count=0;
		
		while(num>0)
		{
			count++;
			num/=10;
			
			for(;num!=0;num/=10)count++;
		}return count;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number:");
		int num=sc.nextInt();
		
		System.out.println(length(num));
	}

}
