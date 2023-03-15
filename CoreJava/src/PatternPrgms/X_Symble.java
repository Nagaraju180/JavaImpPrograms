package PatternPrgms;

import java.util.Scanner;

public class X_Symble {

	public static void main(String[] args) {
     Scanner scn=new Scanner(System.in);
     System.out.println("Enter the Number:");
     int num=scn.nextInt();
     
     for(int i=0;i<=num;i++)
     {
    	 for(int j=num;j>=i;j--){
    		 if(j>=i)System.out.print("*");
    		 else System.out.print(" ");
    	 }
     }
     System.out.println();
	}

}
