package javaImPrograms;

import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a NUmber:");
        int n=sc.nextInt();
        
        int stars=1;
        int spaces=n-1;
        
        for(int i=1;i<=n;i++)
        {
        	for(int j=1;j<=spaces;j++) System.out.print(" ");
        	for(int j=1;j<=stars;j++) System.out.print("*");
        	System.out.println();
        	spaces--;
        	stars+=2;
        }
	}

}
