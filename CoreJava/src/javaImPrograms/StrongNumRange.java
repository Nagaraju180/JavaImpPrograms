package javaImPrograms;

import java.util.Scanner;

public class StrongNumRange {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the Range:");
		int a=scn.nextInt();
		int b=scn.nextInt();
		
		for(int i=a;i<=b;i++)
		{
			int num=i;
			int sum=0;
			while(num>0)
			{
				int digit=num%10;
				int fact=1;
				for(int j=1;j<=digit;j++)
				{
					fact*=j;
				}
				sum+=fact;
				num/=10;
			}
			if(sum==i)System.out.println(i);
		}
	}

}
