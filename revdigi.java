import java.io.*;
import java.util.Scanner;
public class revdigi
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int r=0;

System.out.println("enter a number");
int n=sc.nextInt();
while(n!=0)
{
r=r*10;
r=r+n%10;
n=n/10;

}
System.out.println("reversed number"+r);
}
}