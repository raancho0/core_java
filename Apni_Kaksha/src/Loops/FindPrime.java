package Loops;

import java.util.Scanner;

public class FindPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		boolean isPrime=true;
//		for(int i=2;i<t;i++)
//		{
//			if(t%i==0)
//			{
//				isPrime=false;
//				break;
//			}
//		}
//		if(t<2)
//			isPrime=false;
//		System.out.println("isPrime " + isPrime);
		
		for(int i=2;i*i<=t;i++)
		{
			if(t%i==0)
			{
				isPrime=false;
				break;
			}
		}
		if(t<2)
			isPrime=false;
		System.out.println("isPrime " + isPrime);
		
	}

}
