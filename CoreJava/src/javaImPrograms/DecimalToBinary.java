package javaImPrograms;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
	 Scanner scn=new Scanner(System.in);
	 System.out.println("Enter the Decimal Value: ");
	 int DecNum=scn.nextInt();
	 
	 int pos=1;
	 int BinNum=0;
	 
	 while(DecNum>0) {
		 BinNum+=(DecNum%2)*pos;
		 DecNum/=2;
		 pos*=10;
	 }
	 System.out.println("Binary Number= "+BinNum);
	}

}