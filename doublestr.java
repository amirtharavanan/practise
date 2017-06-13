import java.io.*;
import java.util.*;
public class doublestr
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int k=0;
StringBuffer sb=new StringBuffer();
sb.append(sc.nextLine());
int n=sb.length();
for(int i=0;i<n;i++)
{
char c=sb.charAt(i);
for(int j=0;j<n;j++)
{
char c1=sb.charAt(j);
if(c==c1 && i!=j)
{
sb.setCharAt(i,'*');
sb.setCharAt(j,'*');
}
}
}
for(int i=0;i<n;i++)
{
char c=sb.charAt(i);
if(c=='*')
k++;
}
if(k==n)
System.out.println("Double String");
else
System.out.println("Not Double String");
}
}
