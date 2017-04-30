import java.io.*;
import java.util.Scanner;
public class reverse
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String sb=sc.next();
System.out.println(sb);
String reverse = new StringBuffer(sb).reverse().toString();
System.out.println(reverse);
if(sb.equals(reverse))
{
System.out.println("palindrome");
}
else
{
System.out.println("not a palindrome");
}
}
}