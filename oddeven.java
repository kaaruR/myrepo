import java.util.Scanner;

public class oddeven {
		private static Scanner sc;

		public static void main(String args[])
		{
			sc = new Scanner(System.in);
			int n=sc.nextInt();
			if(n%2==0)
			{
			System.out.println("even");
			}
			else 
			{
			System.out.println("odd");
		}
	}
}
