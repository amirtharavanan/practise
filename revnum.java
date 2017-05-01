public class new15
{
public static void main(String args[])
{
string orig,rev="";
Scanner scan=new Scanner(System.in);
System.out.print("Enter a number to reverse :");
orig=scan.nextline();
len=orig.len();
for(i=len-1;i>0;i--)
{
rev=rev+orig.charAt(i);
}
System.out.print("Reverse of Entered number is: "+rev);
}
}
