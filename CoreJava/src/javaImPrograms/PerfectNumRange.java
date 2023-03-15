package javaImPrograms;

import java.util.Scanner;

public class PerfectNumRange {

	public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the Range:");
     int a=sc.nextInt();
     int b=sc.nextInt();
     for(int i=a;i<=b;i++)
     {
    	 int temp=i;
    	 int sum=0;
    	 
    	 for(int j=1;j<=i/2;j++)
    	 {
    		 if(i%j==0)
    		 sum+=j;
    	 }
    	 if(sum==temp) System.out.println(i);
     }
     
	}

}
