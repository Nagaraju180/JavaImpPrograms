package javaImPrograms;

import java.util.Scanner;

public class NeonNum {
    public static int power(int base,int exp)//for caliculating power(square of anum
    {
    	int res=1;
    	for(int i=1;i<=exp;i++)
    	{
    		res=res*base;
    	}
    	return res;
    }
    public static int totalSum(int num)//for caliculating sum of square of a number
    {
    	int sum=0;
    	while(num!=0)
    	{
    		int rem=num%10;
    		sum=sum+rem;
    		num=num/10;
    	}
    	return sum;
    }
    public static void main(String[]args)
    {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter the Number:");
    	int num=sc.nextInt();
    	
    	if(num<0) System.out.println("No negitives");
    	else 
    	{
    		int sqrNum=power(num,2);
    		int overallSum=totalSum(sqrNum);
    		
    		if(overallSum==num)System.out.println("Is Neon number ");
    		else System.out.println("Is not a Neon number");
    	}
	}
}