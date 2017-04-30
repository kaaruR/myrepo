import java.io.*;
import java.util.Scanner;
public class fact
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter a number");
int n=sc.nextInt();
if(n>=0)
{
int fact=1;
for(int i=1;i<=n;i++)
{
fact=fact*i;
}
System.out.println("factorial:"+fact);
}
else
{
System.out.println("enter a vaid number");
}
}
}