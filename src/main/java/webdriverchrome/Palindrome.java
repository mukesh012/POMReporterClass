package webdriverchrome;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		
		int getNumber;
		Scanner sc = new Scanner(System.in);		
		System.out.println("Please Enter any getNumber: ");
		getNumber = sc.nextInt();
		int temp = getNumber;
		int r,sum=0;	
		while (getNumber!=0)
		{
			r=getNumber%10;
			sum=(sum*10)+r;
			getNumber=getNumber/10;
			sc.close();
		}
if (temp==sum)
	System.out.println("It is a Palindrome");
else
	System.out.println("It is not a palindrome");
	}

}
