import java.io.*;
import java.util.Scanner;
public class digi
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int i=0;
if(a>=-9999999 && a<=9999999)
{
while(a!=0)
{
int r=a%10;
a=a/10;
i++;
}
System.out.println("no of digits:"+i);
}

else
{
System.out.println("enter a valid no from -9999999 to 9999999");
}
}
}