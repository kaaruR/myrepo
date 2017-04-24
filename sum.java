import java.io.*;
import java.util.Scanner;
public class sum
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter any number:");
int n=sc.nextInt();
int sum=0;
int i=1;
if(n>0)
{
while(i<=n)
{
sum=sum+i;
i++;
}
System.out.println(sum);
}
else
{
System.out.println("enter a valid natural number");
}
}
}