package javaImPrograms;

import java.util.Scanner;

public class Daimond {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number:");
		int n=sc.nextInt();
		
		int stars=1;
		int spaces=n-2;
		for(int i=1;i<=n;i++)
		{
		   for(int j=1;j<=spaces;j++) System.out.print(" ");
			 for(int j=1;j<=stars;j++)
			 {
				 if(j==1||j==stars)System.out.print("*");
				 else System.out.print(" ");
			 }
		
		System.out.println();
		if(i<=n/2)
		   {
	             spaces--;
		         stars+=2;
		   }else {
			   spaces++;
		       stars-=2;
		 } 	
		}
		
	}

}
