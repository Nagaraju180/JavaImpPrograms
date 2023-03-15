package javaImPrograms;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=scn.nextInt();
        
        for(int i=2;i<=num/2;i++)
        {
        	if(num%i==0)
        	{
        		System.out.println(num+" Not a prime number");
        		return;
        	}
        }
        System.out.println(num+" Is a prime Number");
	}

}
//boolean flag=true;
//for(int i=2;i<=num/2;i++)
//{
	//if(num%i==0)
	//{
		//System.out.println(num+" Not a prime Number");
		//flag=false;
	    //break;
	//}
//}
	//if(flag) System.out.println(num+" Is a prime number");

