package javaImPrograms;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the 5 digits number: ");
       int num=sc.nextInt();
       
       int reminder;
       int reverse=0;
       int temp=num;
       
       System.out.println("The number before riverse: "+num);
       
       while(num>0)
       {
    	   reminder=num%10;
    	   reverse=(reverse*10)+reminder;
    	   num=num/=10;
       }
       System.out.println("The number after reverse: "+reverse);
       
       if(temp==reverse)System.out.println("Palindrome");
       else System.out.println("Not a Palindrome");
	}

}
