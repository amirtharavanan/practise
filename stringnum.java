public class stringnum
{
static int i,c=0,res;
static int wordcount(String s)
{
char ch[]=new char[s.length()];
for(i=o;i<s.length();i++)
{
ch[i]=s.charAt(i);
if(((i>0)&&(ch[i]!='')&&(ch[i-1]==''))
c++;
}
return c;
}
public static void main(String args[])
{
res=StringDemo.wordcount("i am typing");
System.out.println("The number of words in the string are"+res);
}
}

