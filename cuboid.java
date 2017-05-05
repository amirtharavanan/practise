import java.util.Scanner;
public class cuboid
{
Public static void main(String args[])
{
int l,b,h;
double area,volume;
Scanner s=new Scanner(SYstem.in);
System.out.print("Enter the length of cuboid:");
l=s.nextInt();
System.out.print("Enter the breadth of cuboid:");
b=s.nextInt();
System.out.print("Enter the height of cuboid:");
h=s.nextInt();
area=2*((l*b)+(b*h)+(h*l));
System.out.println("Surface Area of cuboid:"+area);
volume=l*b*h;
System.out.println("Volume of cuboid:"+volume);
}
}
