package javaImPrograms;

public class PrimeNumMethods {

	public static void main(String[] args) 
	{
		for(int i=100;i<=200;i++)
		{
			if(isPrime(i)) System.out.println(i);
		}
	}
	public static boolean isPrime(int num)
	{
		if(num<=1)return false;
		for(int i=2;i<=num/2;i++)
		{
			if(num%i==0)return false;
		}
		return true;
	}
	

}
