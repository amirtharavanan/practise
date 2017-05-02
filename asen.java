import java.util.Scanner;
public class asen
{
public static void main(String args[])
{
int n,tenp;
Scanner scan=new Scanner(System.in);
System.out.print("Enter the no of elements in an array:");
n=s.nextInt();
int a[]=newint[n];
System.out.print("Enter elements of the array:");
for(int i=0;i<n;i++)
{
a[i]=s.nextInt();
}
for(int i=0;i<n;i++)
{
for(int j=1+1;j<n;j++)
{
if(a[i]>a[j])
{
temp=a[i];
a[i]=a[j];
a[j]=temp;
}
}
}
System.out.print("Ascending Order:");
for(int i=0;i<n-1;i++)
{
System.out.print(a[i]+",");
}
System.out.print(a[n-1]);
}


