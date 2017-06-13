import java.io.*;
import java.util.*;
public class Delete1
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int k=sc.nextInt();
int p[]=new int[10];
int i=0;
while(n>0)
{
int temp;
temp=n%10;
p[i++]=temp;
n=n/10';
}
int g=i;
System.out.println(g);
in d[]=new int[g];
System.out.println(p,0,d,0,g);
Arrays.sort(d);
for(int j=0;j<g-k;j++)
System.out.println(d[j]);
}
}
