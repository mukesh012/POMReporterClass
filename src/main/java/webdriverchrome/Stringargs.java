package webdriverchrome;

import java.util.Scanner;

public class Stringargs {

	public static void main(String arr[]) 
	{
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		
		for (int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+"\t");
		}
		
	System.out.println( );
	//get value and print
	Scanner Input =new Scanner(System.in);
	System.out.println("Enter a");
	int a=Input.nextInt();
		System.out.print(arr[a]+"\t");
	Input.close();
	}
	
	}


