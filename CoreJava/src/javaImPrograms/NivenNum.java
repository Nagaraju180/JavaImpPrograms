package javaImPrograms;

import java.util.Scanner;

public class NivenNum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number:");
		int num=sc.nextInt();
		
		if(num<0) System.out.println("Pls Dont enter negitive numbers");
		else
		{
			int sum=0;
			int temp=num;
			
			while(num!=0)
			{
				int rem=num%10;
				System.out.println("remainder:"+rem);
				sum=sum+rem;
				System.out.println("sum:"+sum);
				num=num/10;
				System.out.println("num:"+num);
			}
			if(temp%sum==0)System.out.println("Niven Number");
			else System.out.println("Not a Niven Number");
		}
	}

}
