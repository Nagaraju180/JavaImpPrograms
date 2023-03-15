package javaImPrograms;

import java.util.Scanner;

public class Power {
        public static int power(int base,int exp)
        {
        	int pow=1;
        	
        	for(int i=1;i<=exp;i++)
        	{
        		pow=pow*base;
        	}
        	return pow;
        }
        public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter a base:");
			int base=sc.nextInt();
			System.out.println("Enter a exponent:");
			int exp=sc.nextInt();
			System.out.println(power(base,exp));
		}
}
