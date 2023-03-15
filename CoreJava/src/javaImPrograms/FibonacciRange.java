package javaImPrograms;

import java.util.Scanner;

public class FibonacciRange {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Range:");
		int x=sc.nextInt();
		int y=sc.nextInt();
		
		int a=0,b=1,c;
		
		for(int i=1;i<=y;i++)
		{
			System.out.print(a+"\t");//it is printing 10 fibanocci numbers
			c=a+b;
			a=b;
			b=c;
		}

	}

}