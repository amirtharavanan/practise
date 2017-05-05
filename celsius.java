import java.util.*;
class celsius
{
public static void main(String args[])
{
double celsius,fahrenheit;
Scanner in=new Scanner(System.in);
System.out.println("Enter a temperature in celsius");
celsius=in.nextDouble();
fahrenheit=32+(celsius*9/5);
System.out.println(celsius+"ºC="+fahrenheit+"ºF");
}
}
