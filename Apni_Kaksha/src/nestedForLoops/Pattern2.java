package nestedForLoops;

import java.util.Scanner;

public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int t=s.nextInt();
		for(int j=1;j<=t;j++)
		{
			for(int i=1;i<=j;i++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
