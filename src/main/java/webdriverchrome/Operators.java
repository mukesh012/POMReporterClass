package webdriverchrome;

public class Operators{

public static void main(String[] args)
{
	int a= 5;
	int b= 3;
    boolean flag = true;
 flag = (a<b);
 System.out.println("value is" +flag);
 flag = (a>b);
 System.out.println("value is" +flag);
 flag = (a+b==8);
 System.out.println("5+3=8 is" +flag);
 flag = (a-b==8);
 System.out.println("5-3=8 is" +flag);
 flag = (a-b==2) && (a+b==8);//both the condition should true
 System.out.println("(a-b==2) && (a+b==8)" +flag);
 flag = (a-b==2) || (a+b==8);//any one of condition is satisfied
 System.out.println("(a-b==2) || (a+b==8)" +flag);
 flag = (a!=b);//not equal
 System.out.println("(a!=b)" +flag);
 if (flag = (a-b==2) && (a+b==8))
	 System.out.println("(a-b==2) && (a+b==8) is correct");
 else	 
     System.out.println("condition is not true");
 System.out.println(a++);
 System.out.println(a);
 System.out.println(++a);
 System.out.println(a);
 System.out.println(b--);
 System.out.println(b);
 System.out.println(--b);
 System.out.println(b);
 System.out.println(flag);
 System.out.println(!flag);

 if(a==1||!flag) 
	 System.out.println("any one of the condition is satisfied"); 
 else
	 System.out.println("Condition not satisfied");
 
 if(a==1||flag) 
	 System.out.println("any one of the condition is satisfied"); 
 else
	 System.out.println("Condition not satisfied");
 }}

