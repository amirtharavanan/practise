import java.io.*;
import java.util.*;
public class Camelchecks
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        int flag=0;
        String w[]=s1.split(" ");
        for(int i=0;i<w.length;i++)
        {
            if(Character.isUpperCase(w[i].charAt(0))==true)
            flag++;
        }
        if(w.length==flag)
        {
            System.out.println("ITS A CAMEL CASE");
        }
        else
        {
            System.out.println("ITS NOT A CAMEL CASE");
        }
    }
}
