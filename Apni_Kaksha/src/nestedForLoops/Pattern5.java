package nestedForLoops;

import java.util.Scanner;

public class Pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		
		for(int i=1;i<=t;i++)
		{
			for(int j=1;j<=t-i;j++)
			{
				System.out.print("  ");
			}
			
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
				System.out.println();
		}
	}

}
