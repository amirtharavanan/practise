import java.util.Scanner;
public class new10
{
 public static void main(String args[])
 {
 int num,rem,orig,rev=0;
 Scanner scan=new Scanner(System.in);
 System.out.println("Enter a Number :");
 num=scan.nextInt();
 orig=num;
 while(num !=0)
 {
 rem=num%10;
 rev=rev*10+rem;
 num=num/10;
 }
 if(rev==orig)
 {
 System.out.print("this is a palindrome");
 }
 else
 {
 System.out.print("this is not a palindrome");
 }
 }
 }
