import java.util.Scanner;
public class binary
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
System.out.println("Enter a binary number: ");
String binaryString=in.nextline();
System.out.println("Result:"+Integer.parseInt(binaryString,2));
}
}
