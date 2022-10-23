import java.util.Scanner;
public class Main
{
	public static void main(String[] args)
	{
	    
    Scanner sc=new Scanner(System.in);
    int num = sc.nextInt();
    if(!(num>=0)){
        num = -1 * num;
        System.out.println(num);
    }
    else{
    System.out.println(num);
	}
	}
}
