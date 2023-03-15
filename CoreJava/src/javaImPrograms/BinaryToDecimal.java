package javaImPrograms;

import java.util.Scanner;

public class BinaryToDecimal {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a Binary Num:");
		int binary=sc.nextInt();
		
		int pos=1;
		int decNum=0;
		
		while(binary>0)
		{
			decNum +=(binary%10)*pos;
			binary/=10;
			pos*=2;
		}
		System.out.println("Decimal Num = "+decNum);
	}

}