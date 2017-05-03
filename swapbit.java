import java.util.Scanner;
public class swapbit
{
public static void main(String args[])
{
int m,n;
Scanner s=new scanner(System.in);
System.out.print("Enter the first number:");
m=s.nextInt();
System.out.print("Enter the Second number:");
n=s.nextInt();
m=m^n;
n=m^n;
m=m^n;
System.out.print("After swapping");
System.out.print(" the first number:"+m);
System.out.print(" the second number:"+n);
}
}
