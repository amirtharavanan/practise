import java.util.Scanner;
public class simple
{
public static void main(String args[])
{
float p,r,t;
Scanner s=new Scanner(System.in);
System.out.println("Enter the principal amount: ");
p=nextFloat();
System.out.println("Enter the rate of intrest: ");
r=nextFloat();
System.out.println("Enter the time period: ");
t=nextFloat();
float si;
si=(r*t*p)/100;
System.out.println("The simple Interst is: "+si);
}
}
