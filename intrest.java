import java.util.Scanner;
public class intrest
{
public ststic void main(String args[])
{
float p,r,t;
scanner s=new Scanner(System.in);
System.out.println("Enter the principal:");
p=s.nextFloat();
System.out.println("Enter the rate of intrest:");
r=s.nextFloat();
System.out.println("Enter the time period:");
t=s.nextFloat();
float si;
si=(r*t*p)/100;
System.out.println("The Simple Intrest is:"+si);
}
}
