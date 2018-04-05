
package webdriverchrome;

import java.util.Scanner;

public class Sumofnumbers 

{
	
public static void main(String[] args)
	{
	    int Number,Remainder,Sum = 0; 
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        Number = sc.nextInt();
        while (Number>0)
        {
        	Remainder = Number % 10;
            Sum = Sum + Remainder;
            Number = Number / 10;
        }
        System.out.println("the sum is" +Sum);
	}
}


        
        
		
	





