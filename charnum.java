import java.util.*;
import java.io.*;
public class charnum
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
Systemout.println("Enter string for counting:");
  String input=in.next();
  int chars=0;
  while(in.hasNextByte())
  {
    in.nextByte();
    chars++;
  }
}
}
