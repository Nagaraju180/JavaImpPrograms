package javaImPrograms;

import java.util.Scanner;

public class PerfectNum {

	public static void main(String[] args) {
       Scanner scn=new Scanner(System.in);
       System.out.println("Enter the number:");
       int num=scn.nextInt();
       
       int sum=0;
       for(int i=1;i<=num/2;i++)
       {
    	   if(num%i==0)sum+=i;
       }
       if(sum==num)System.out.println(num+" Perfect Number");
       else System.out.println(num+" Not a perfect Number");
	}

}
