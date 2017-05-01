import java.util.Scanner;
public class new11
{
public static void main(String args[])
{
int num,i,count=0;
Scanner scan=new Scanner(System.in);
System.out.print(Ënter a number:");
num=scan.nextInt();
for(i=2;i<=num;i++)
{
if(num%i==0)
{
count++;
break;
}
if(count == 0)
{
System.out.print("This is a prime number");
}
else
{
System.out.print("This is not a prime number");
}
}
}

