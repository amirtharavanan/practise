import java.io.*;
class RemoveDupChar
{
public static void main(String args[])
{
BufferedReader br= new BufferReader(new InputStreamReader(System.in));
String s=br.readline();
System.out.print("Enter any word:");
int l=s.length();
char ch;
String ans="";
for(int i=0;i<l;i++)
{
ch=s.charAt(i);
if(ch!='')
ans=ans+ch;
s=s.replace(ch,'');
}
System.out.println("Word after removing duplicate charecter:"+ans);
}
}
