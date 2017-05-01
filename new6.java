public class new6
{
public static void main(String args[])
{
int x,i=1;
int sum=0;
System.out.println("Enter the numbers");
Scanner scan =new Scanner(System.in);
x=scan.nextInt();
while(i<=x)
{
sum=sum+i;
i++;
}
System.out.println("Sum of "+x+" numbers is :"+sum);
}
}
}
