import java.util.Scanner;
public class loop
{
private static int length;
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter how many numbers to print");
int n-s.nextInt();
length=n;
System.out.println("Printing number from 1 to""+n);
print(1);
s.close();
}
}
private static void print(int num)
{
if(num<=length)
{
System.out.println(num++);
print(num);
}
}
