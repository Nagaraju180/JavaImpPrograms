package javaImPrograms;

import java.util.Scanner;

public class EvenorOdd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to check Odd or Even:");
		int num=sc.nextInt();
		
		if(num%2!=0)
		{
			System.out.println(num+" is Odd number");
		}else System.out.println(num+" is Even Number");
	}

}