package PatternPrgms;

import java.util.Scanner;

public class Traingle {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
	     System.out.println("Enter the number:");
	     int num=scn.nextInt();
	     for(int i=1;i<=num;i++)
	     {
	    	 for(int j=num;j>=1;j--)
	    	 {
	    		 if(j>=i)  System.out.print("*");
	    		 else System.out.print(" ");	    	 }
	    	 System.out.println();
	     }
	}

}
