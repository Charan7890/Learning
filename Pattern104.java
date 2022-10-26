import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		/*
		
		1 2 3 4 5 6 7 8
		2 3 4 5 6 7 8 1
		3 4 5 6 7 8 1 2
		4 5 6 7 8 1 2 3
		5 6 7 8 1 2 3 4
		6 7 8 1 2 3 4 5
		7 8 1 2 3 4 5 6
		8 1 2 3 4 5 6 7
		
		*/
		int x = 0; // 11 ---> 1 changing
		for(int i=0;i<n;i++)
		{
		    
		for(int j = 0;j<n-i;j++)
		{
		 System.out.print((j+1+x)+" ");
		}
		
		for(int k = 1;k<=i;k++){
		    System.out.print(k+" ");
		}
		
		System.out.println();
		x++;
		}
	}
}
