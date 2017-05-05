import java.util.Scanner;
public class npr
{
public static int fact(int num)
{
int fact=1,i;
for(i=1;i<=num;i++)
{
fact=fact*i;
}
return fact;
}
public static void main(String args[])
{
int n,r;
Scanner scan=new Scanner(System.in);
System.out.print("Enter value of n: ");
n=scan.nextInt();
System.out,print("Enter the value of r:");
r=scan.nextInt();
System.out.print("\n NPR="+(fact(n)/(fact(n-r)));
}
}
