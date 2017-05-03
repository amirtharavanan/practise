class fib12
{
public static void main (String args[])
{
int n1=0,n2=1,n3,i,count;
  System.out.println("Enter the number:");
  Scanner in=new Scanner(System.in);
  count=in.nextInt();
System.out.printl(n1+" "+n2);
for(i=2;i<count;++i)
{
n3=n1+n2;
System.out.println(" "+n3);
n1=n2;
n2=n3;
}
}
