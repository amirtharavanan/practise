import java.util.Scanner;
class new3
{
public static void main(String args[])
{
int x,y,z;
System.out.println("Enter three numbers");
Scanner scan=new Scanner(System.in);
x=scan.nextInt();
y=scan.nextInt();
z=scan.nextInt();
 if( x > y && x > z)
  System.out.println("First number is largest");
 else if( y > z && y > z)
  System.out.println("Second number is largest");
  else if( z > x && z > y)
  System.out.println("Third number is largest");
  }
  }
