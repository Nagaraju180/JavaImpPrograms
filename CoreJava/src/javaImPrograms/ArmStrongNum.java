package javaImPrograms;

import java.util.Scanner;

public class ArmStrongNum {

	public static void main(String[] args) {
     Scanner scn=new Scanner(System.in);
     System.out.println("Enter the Number: ");
     int num=scn.nextInt();
     
     int temp=num;
     int len=0;
     while(num>0)
     {
    	 len++;
    	 num/=10;
     }
     
     num=temp;
     int sum=0;
     while(num>0)
     {
    	 int digit=num%10;
    	 int prod=1;
    	 
    	 for(int i=1;i<=len;i++)
    	 {
    		 prod*=digit;
    	 }
    	 sum+=prod;
         num/=10;
     }
     if(sum==temp)System.out.println(temp+" is ArmStrong Number");
     else System.out.println(temp+" Not an ArmStrong Number ");
     
	}

}
