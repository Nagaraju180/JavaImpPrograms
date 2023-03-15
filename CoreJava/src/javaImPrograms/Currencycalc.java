package javaImPrograms;

import java.util.Scanner;

public class Currencycalc {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number:");
		int n=sc.nextInt();
		

		if(n>=2000)
		{
			System.out.println("2000 x"+(n/2000));
			n%=2000;
		}
		if(n>=500)
		{
			System.out.println("500 x"+(n/500));
			n%=500;
		}
		if(n>=200)
		{
			System.out.println("200 x"+(n/200));
			n%=200;
		}
		if(n>=100)
		{
			System.out.println("100 x"+(n/100));
			n%=100;
		}else System.out.println("Invalid Amount....! Try Again");
	}

}
