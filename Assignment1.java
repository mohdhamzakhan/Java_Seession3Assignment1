package session3;

import java.util.Scanner;

public class Assignment1 {
	public static void main(String[] args)
	{
		System.out.println("Enter the no for which square root to be calculated");
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		System.out.println(squreroot(num1));
		System.out.println("Enter the no for which cube root to be calculated");
		num1=sc.nextInt();
		System.out.println(cuberoot(num1));
		sc.close();
	}
	static double squreroot(double n)
	{
		return Math.sqrt(n);
	}
	
	static double cuberoot(double n)
	{
		return Math.cbrt(n);
	}
}
