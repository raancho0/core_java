package Loops;

import java.util.Scanner;

public class XPowerY {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int x=s.nextInt();
		int y=s.nextInt();
		int result=1;
		for(int i=0;i<y;i++) {
			result=result*x;
		}
		System.out.println(result);
	}

}
