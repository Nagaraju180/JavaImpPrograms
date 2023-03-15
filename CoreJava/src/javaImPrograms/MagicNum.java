package javaImPrograms;

import java.util.Scanner;

public class MagicNum {

	  public static int total(int num)
	  {
		  int sum=0;
		  for(;num!=0;num/=10)sum=sum+(num%10);
		  return sum;
	  }
	  public static int reverse(int num)
	  {
		  int rev=0;
		  
		  while(num!=0)
		  {
			  int rem=num%10;
			  rev=rev*10+rem;
			  num=num/=10;
		  }
		  return rev;
	  }
	  public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number:");
		int num=sc.nextInt();
		
		if(num<0) System.out.println("No negitives");
		else
		{
			int resultTotal=total(num);
			int resultReverse=reverse(resultTotal);
			
			int result=resultTotal*resultReverse;
			
			if(num==result)System.out.println("Its a Magic Number");
			else System.out.println("Not a Magic Number");
		}
	}
}
