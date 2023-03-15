package PatternPrgms;

import java.util.Scanner;

public class Piramid {

	public static void main(String[] args) {
     Scanner scn=new Scanner(System.in);
     System.out.println("Enter the number:");
     int num=scn.nextInt();
     
     int spaces=num-1;
     int stars=1;
     for(int i=1;i<=num;i++)
     {
    	 for(int j=1;j<=spaces;j++)
    	 {
    		 System.out.print(" ");
    	 }
    	 for(int k=1;k<=stars;k++)
    	 {
    		 System.out.print("*");
    	 }
    	 System.out.println();
    	 spaces--;
    	 stars+=2;
     }
	}

}
