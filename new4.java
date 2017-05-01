import java.util.Scanner;
public class new4
{
public static void main(String args[])
{
int yr;
Scanner scan=new Scanner(System.in);
System.out.print("Enter Year :");
yr=scan.nextInt();
if((yr%4==0)&&(yr%100!=0))
{
System.out.print("This is a leap year");
}
else if(yr%100==0)
{
System.out.print("This is  not a leap year");
}
else if(yr%400==0)
{
System.out.print("This is a leap year");
}
else
{
System.out.print("This is not a leap year");
}
}
}
