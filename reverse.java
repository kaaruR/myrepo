import java.io.*;
import java.util.Scanner;
public class reverse
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter a string");
String sb=sc.next();
String reverse = new StringBuffer(sb).reverse().toString();
System.out.println("reversed string:"+reverse);
}
}