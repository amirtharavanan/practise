import java.util.*;
class randomnum
{
public static void main(String args[])
{
int c;
Random t=new Random();
for(c=1;c<10;c++)
{
System.out.println(t.nextInt(100));
}
}
}