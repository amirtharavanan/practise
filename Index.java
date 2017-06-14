import java.io.*;
import java.util.*;
public class Index
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        if(a.length%2!=0)
        {
            int sum1=0,sum2=0;
            for(int i=0;i<a.length/2;i++)
            {
                sum1=sum1+a[i];
            }
            for(int i=a.length/2+1;i<a.length;i++)
            {
                sum2=sum2+a[i];
            }
            if(sum1==sum2)
            {
                System.out.println("Value="+a[a.length/2]);
            }
         }
         if(a.length%2==0)
         {
             int sum1=0,sum2=0;
             for(int i=0;i<a.length/2;i++)
             {
             sum1=sum1+a[i];
         }
         for(int i<a.length/2;i<a.length;i++)
         {
         sum2=sum2+a[i];
         }
         }
      }
      }
    }
}
