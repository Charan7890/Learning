
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner ob = new Scanner(System.in);
		
		int limit = ob.nextInt();
		int sum=0;
		do{
		    System.out.print(limit+" ");
		    sum = sum +limit;
		    limit--;
		}while(limit>0);
		
		
		System.out.println("\n"+sum);
	}
}
