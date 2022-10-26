import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
        /*
            col(n)
          0 1 2 3 4
        0 * * * * *
        1 * * * *
 row(n) 2 * * *
        3 * *
        4 *
		
		  */
		for(int i=0;i<n;i++)
		{
		for(int j = 0;j<n-i;j++)
		{
		    System.out.print("* ");
		}
		System.out.println();
		}
	}
}
