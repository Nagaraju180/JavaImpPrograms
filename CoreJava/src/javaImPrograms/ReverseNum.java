package javaImPrograms;

import java.util.Scanner;

public class ReverseNum {

	public static void main(String[] args) 
	{
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the Number:");
      int num=sc.nextInt();
      
      int reverse=0;
      int reminder;
      
      System.out.println("Given Number before Reverse: "+num);
      
      while(num>0)
      {
    	  reminder=num%10;
    	  reverse=(reverse*10)+reminder;
    	  num=num/=10;
    	  System.out.println("Given Number  after Reverse: "+reverse);
      }
	}

}
