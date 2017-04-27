import java.io.*;
import java.util.Scanner;
public class power
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the base number:\n");
int base=sc.nextInt();
if(base>=0)
{
System.out.println("Enter the exponential:\n");
int exp=sc.nextInt();
long result=1;
while(exp!=0)
{
result=result*base;
exp--;
}
System.out.println("power:"+result);
}
else
{
System.out.println("enter a valid number");
}
}
}