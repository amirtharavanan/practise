import java.io.*;
import java.util.*;
public class Hello
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String s=sc.next();
String ss[]=s.split(" ");
for(int i=ss.length-1;i>=0;i--)
{
System.out.println(ss[i]+" ");
}
}
}
