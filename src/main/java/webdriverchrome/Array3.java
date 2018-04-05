package webdriverchrome;

import java.util.Scanner;

public class Array3 {

	public static void main(String[] args)
	{
		Scanner Input =new Scanner(System.in);
		System.out.println("Enter a");
		int a=Input.nextInt();
		System.out.println("Enter b");
		int b=Input.nextInt();
		int m[][]={{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15}};
		for(int i=0;i<a;i++){
		 for(int j=0;j<b;j++){
		   System.out.print(m[i][j] +"\t");
		 }
		System.out.println();
		 Input.close();  
		}
	}

}