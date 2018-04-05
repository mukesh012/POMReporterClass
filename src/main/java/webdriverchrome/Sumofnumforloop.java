package webdriverchrome;

import java.util.Scanner;
 
public class Sumofnumforloop {
	
	public static void main(String[] args) 
	{
		int Number, Reminder, Sum =0;
		Scanner sc = new Scanner(System.in);		
		System.out.println("Please Enter any Number: ");
		Number = sc.nextInt();
		for ( Sum =0 ; Number > 0; Number++)
		{
			Number = Number/10;
			Reminder = Number % 10;
			Sum = Sum+ Reminder;
		}
		System.out.println("Sum of the digits of Given Number " +Sum);
		sc.close();
	}
}