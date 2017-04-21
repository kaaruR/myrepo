import java.util.Scanner;

public class cpnz {
		private static Scanner sc;

		public static void main(String args[])
		{
			sc = new Scanner(System.in);
			int n=sc.nextInt();
			if(n!=0)
			{
			if(n>1)
			{
			System.out.println("positive");
			}
			else 
			{
			System.out.println("negative");
			}}
			else
			{
			System.out.println("Zero");
		}
	}

}
