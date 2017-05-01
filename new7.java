public class new7
{
public static void main(String args[])
{
int x;
int sum=0;
System.out.println("Enter the numbers");
Scanner scan =new Scanner(System.in);
x=scan.nextInt();
for(int i=1;i<=x;i++)
{
sum=sum+i;
}
System.out.println("Sum of "+x+" numbers is :"+sum);
}
}
}
