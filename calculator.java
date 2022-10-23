import java.util.Scanner;
public class Main
{
	public static void main(String[] args)
	{
	    
    Scanner sc=new Scanner(System.in);
    System.out.println("enter 2 num");
	int a=sc.nextInt();
	int b=sc.nextInt();
	char operator = sc.next();                   
	
	switch(operator){
	    case "add":
	        System.out.println(a+b);
	        break;
	    case "sub":
	        System.out.println(a-b);
	        break;
	    default:
	        System.out.println("Invalid Operator");
	}
	   // int sub=a-b;
	   // System.out.println("sub:"+sub);
	}
}
