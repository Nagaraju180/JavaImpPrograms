package PatternPrgms;

import java.util.Scanner;

public class Square {

	public static void main(String[] args) {
       Scanner scn=new Scanner(System.in);
       System.out.println("Enter the number:");
       int num=scn.nextInt();
       
       for(int i=1;i<=num;i++)
       {
    	   for(int j=1;j<=num;j++)
    	   {
    		   if(j>=i) {
    		   System.out.print(j);
    		   }else {
    			   System.out.print(" ");
    		   }
    	   }
    	   System.out.println();
       }
	}

}
