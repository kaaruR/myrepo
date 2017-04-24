import java.io.*;
import java.util.Scanner;
public class sumofn
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter any number:");
int n=sc.nextInt();
int sum=0;
if(n>=0)
{
for(int i=0;i<=n;i++)
{
sum=sum+i;
}
System.out.println(sum);
}
else
{
System.out.println("enter a valid number");
}
}
}