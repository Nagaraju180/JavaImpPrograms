package javaImPrograms;

import java.util.Scanner;

public class Leapyear {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Year");
		int y=sc.nextInt();
		
		if((y%400==0)||(y%100!=0 && (y%4==0)))
		{
			System.out.println(y+" is a Leap year ");
		}
		else System.out.println(y+" is Not a Leap year ");

	}

}
