import java.io.*;
import java.util.*;
public class Prime1
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int number=2;
int sum=0;
int count=0;
while(count<n)
{
if(isPrimenumber(number))
{
System.out.println(number);
count++;
int temp=number;
while(temp>0)
{
int t=temp%10;
sum+=t;
temp=temp/10;
}
}
if(sum==0)
{
break;
}
number++;
}
System.out.println(" ");
}
  private static boolean isPrimeNumber(int number){
	         
	        for(int i=2; i<=number/2; i++){
	            if(number % i == 0){
	                return false;
	            }
	        }
	        return true;
	    }

	}


